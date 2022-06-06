package com.test.starwars.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> generalException(RuntimeException e){
        return new ResponseEntity<>("Could not server you request [ reason - "+e.getMessage()+"]", HttpStatus.NOT_FOUND);
    }
}
