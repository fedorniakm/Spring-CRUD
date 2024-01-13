package com.narentie.springcrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {

    private Long id;
    private String title;
    private Integer pagesAmount;
    private String iban;

}
