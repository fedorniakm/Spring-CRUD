package com.narentie.springcrud.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;

@Entity
@Table(name = "books")
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

    @ManyToOne
    private Author author;

    @ManyToOne
    private Publisher publisher;

    @OneToMany
    @JoinColumn(name = "book_id")
    private List<Page> pages;

}
