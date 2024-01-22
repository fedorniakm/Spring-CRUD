package com.narentie.springcrud.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Builder
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "pages_amount")
    private Integer pagesAmount;

    @Column(name = "iban")
    private String iban;

}
