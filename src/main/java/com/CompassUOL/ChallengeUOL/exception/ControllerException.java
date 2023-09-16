package com.CompassUOL.ChallengeUOL.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerException {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handle(MethodArgumentNotValidException exception){
        return exception.getMessage();
    }
}
