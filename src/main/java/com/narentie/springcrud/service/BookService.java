package com.narentie.springcrud.service;

import com.narentie.springcrud.entity.Book;
import com.narentie.springcrud.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Optional<Book> getById(final Long id) {
        return bookRepository.findById(id);
    }

    public void add(Book book) {
        bookRepository.save(book);
    }

    public boolean existsById(Long id) {
        return bookRepository.existsById(id);
    }

    public void update(Book book) throws NoSuchElementException {
        bookRepository.save(book);
    }

    public void updateAll(final List<Book> booksToUpdate) {
        bookRepository.saveAll(booksToUpdate);
    }

    public void delete(final Long id) {
        bookRepository.deleteById(id);
    }

    public void deleteAll() {
        bookRepository.deleteAll();
    }
}
