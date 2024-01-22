package com.narentie.springcrud.controller.mapper;

import com.narentie.springcrud.controller.dto.BookRequestDto;
import com.narentie.springcrud.entity.Book;

public interface BookMapper {

    Book mapBookRequestToBook(BookRequestDto bookRequest);

}
