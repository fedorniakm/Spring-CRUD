package com.narentie.springcrud.controller;

import com.narentie.springcrud.controller.dto.BookRequestDto;
import com.narentie.springcrud.controller.mapper.BookMapper;
import com.narentie.springcrud.service.BookService;
import com.narentie.springcrud.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    private final BookMapper bookMapper;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok((bookService.getAll()));
    }

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody BookRequestDto bookRequestDto) {
        var book = bookMapper.mapBookRequestToBook(bookRequestDto);
        bookService.add(book);
        return ResponseEntity.ok("Book is successfully added.");
    }

    @PutMapping
    public ResponseEntity<String> updateAllBooks(@RequestBody List<Book> books) {
        bookService.updateAll(books);
        return ResponseEntity.ok("Books are successfully updated.");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAllBooks() {
        bookService.deleteAll();
        return ResponseEntity.ok("Books are successfully deleted.");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id) {
        var targetBook = bookService
                .getById(id)
                .orElseThrow(() -> new NoSuchElementException(
                        "Requested book [id:" + id + "] does not exist"));
        return ResponseEntity.ok(targetBook);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateBookById(@PathVariable("id") Long id,
                                                 @RequestBody BookRequestDto bookRequestDto) {
        var isTargetAlreadyPresent = bookService.existsById(id);
        var book = bookMapper.mapBookRequestToBook(bookRequestDto);
        book.setId(id);
        bookService.update(book);
        return isTargetAlreadyPresent
                ? ResponseEntity.ok("Book is successfully updated.")
                : ResponseEntity.status(HttpStatus.CREATED).body("Book is successfully created");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long id) {
        bookService.delete(id);
        return ResponseEntity.ok("Book is successfully deleted.");
    }

}
