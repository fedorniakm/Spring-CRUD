package com.narentie.springcrud.controller;

import com.narentie.springcrud.service.BookService;
import com.narentie.springcrud.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok((bookService.getAll()));
    }

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        bookService.add(book);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<String> updateBookById(@RequestBody Book book) {
        bookService.update(book);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id) {
        var targetBook = bookService
                .getById(id)
                .orElseThrow(() -> new NoSuchElementException(
                            "Requested book [id:" + id + "] does not exist"));
        return ResponseEntity.ok(targetBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long id) {
        bookService.delete(id);
        return ResponseEntity.ok().build();
    }

}
