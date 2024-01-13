package com.narentie.springcrud.controller;

import com.narentie.springcrud.entity.Book;
import com.narentie.springcrud.exception.NotSupportedApiCallException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        throw new NotSupportedApiCallException("GET /books is not supported");
    }

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        throw new NotSupportedApiCallException("POST /books is not supported");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id) {
        throw new NotSupportedApiCallException("GET /books/" + id + " is not supported");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBookById(@PathVariable("id") Long id, @RequestBody Book book) {
        throw new NotSupportedApiCallException("PUT /books/" + id + " is not supported");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long id) {
        throw new NotSupportedApiCallException("DELETE /books/" + id + " is not supported");
    }

}
