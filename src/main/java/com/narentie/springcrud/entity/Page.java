package com.narentie.springcrud.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pages")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Builder
public class Page {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "page_number")
    private Integer pageNumber;

    @Column(name = "content")
    private String content;

    @ManyToOne
    private Book book;

}
