package com.narentie.springcrud.controller.mapper;

import com.narentie.springcrud.controller.dto.BookRequestDto;
import com.narentie.springcrud.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public Book mapBookRequestToBook(BookRequestDto bookRequest) {
        return Book.builder()
                .title(bookRequest.title())
                .pagesAmount(bookRequest.pages())
                .iban(bookRequest.iban())
                .build();
    }
}
