package com.traini8.registry.exceptionHandling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex){
        List<ObjectError> allErrors = ex.getBindingResult().getAllErrors();
        Map<String, Object> response = new HashMap<>();
        allErrors.stream().forEach(ObjectError -> {
            String message = ObjectError.getDefaultMessage();
            String field = ((FieldError) ObjectError).getField();
            response.put(field, message);
        });
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }

}
