package com.narentie.springcrud.controller.dto;

public record BookRequestDto(String title,
                             Integer pages,
                             String iban) {
}
