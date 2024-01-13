package com.narentie.springcrud.service;

import com.narentie.springcrud.entity.Book;
import com.narentie.springcrud.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    public Optional<Book> getById(final Long id) {
        return bookRepository.getById(id);
    }

    public void add(Book book) {
        bookRepository.save(book);
    }

    public void update(Book book) {
        bookRepository.save(book);
    }

    public Optional<Book> remove(final Long id) {
        return bookRepository.remove(id);
    }
}
