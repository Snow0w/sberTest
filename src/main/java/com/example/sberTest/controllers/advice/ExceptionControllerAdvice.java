package com.example.sberTest.controllers.advice;

import com.example.sberTest.exceptions.RecipeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(RecipeNotFoundException.class)
    public ResponseEntity<String> exceptionRecipeNotFoundHandler() {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new String("id not found"));
    }
}
