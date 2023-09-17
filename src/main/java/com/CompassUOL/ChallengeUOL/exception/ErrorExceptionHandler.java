package com.CompassUOL.ChallengeUOL.exception;

import ch.qos.logback.core.model.processor.ModelHandlerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ErrorExceptionHandler {
    @Autowired
    private MessageSource messageSource;

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ModelHandlerException.class)
    public List<InvalidCamps> handle(MethodArgumentNotValidException exception){

            List<InvalidCamps> errors = new ArrayList<>();
            List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();

            fieldErrors.forEach(e ->{
                String message =messageSource.getMessage(e, LocaleContextHolder.getLocale());
                InvalidCamps error = new InvalidCamps(e.getField(), message);
                errors.add(error);
            });
            return errors;
    }

}
