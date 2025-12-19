package com.example.demo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseEntity;
import com.example.demo.exception.validationexce;

@RestControllerAdvice
public class gobalexce{
    @ExceptionHandler(validationexce.class)
    public ResponseEntity<String> handleValidationexeception(validationexce ex){
    return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
    }
}