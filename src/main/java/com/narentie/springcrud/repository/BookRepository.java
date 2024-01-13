package com.narentie.springcrud.repository;

import com.narentie.springcrud.entity.Book;
import com.narentie.springcrud.exception.NotSupportedOperationException;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository implements RepositoryBase<Book, Long> {

    public List<Book> getAll() {
        throw new NotSupportedOperationException();
    }

    public Optional<Book> getById(Long id) {
        throw new NotSupportedOperationException();
    }

    public void save(Book book) {
        throw new NotSupportedOperationException();
    }

    public Optional<Book> remove(Long id) {
        throw new NotSupportedOperationException();
    }
}
