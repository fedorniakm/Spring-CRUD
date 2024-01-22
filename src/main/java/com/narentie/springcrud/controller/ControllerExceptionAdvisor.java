package com.narentie.springcrud.controller;

import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice("com.narentie.springcrud.controller")
public class ControllerExceptionAdvisor {

    @ExceptionHandler(NoSuchElementException.class)
    public ProblemDetail handle(NoSuchElementException e) {
        var problemDetail = ProblemDetail.forStatus(404);
        problemDetail.setDetail(e.getMessage());
        return problemDetail;
    }

}
