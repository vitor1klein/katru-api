package com.katru.api.resource.config;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    
    @ExceptionHandler(MyFirstException.class)
    public ProblemDetail handleUserNotFoundExpection(MyFirstException e ) throws URISyntaxException{
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
        problemDetail.setProperty("IdUser", e.getIdUser());
        problemDetail.setType(new URI("http://localhost:8080/problems/What-to-do-when-user-not-found"));
        return problemDetail;
    }
}
