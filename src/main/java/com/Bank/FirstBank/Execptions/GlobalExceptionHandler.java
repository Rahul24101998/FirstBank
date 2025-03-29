package com.Bank.FirstBank.Execptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler  {

    @ExceptionHandler(value= NoSuchCustomerException.class)
    public ResponseEntity<ErrorResponse> handleNoSuchSupplierException(NoSuchCustomerException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ErrorResponse(e.getMessage(),HttpStatus.NOT_FOUND.value())
        );
    }

    @ExceptionHandler(value=MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(e.getMessage(),HttpStatus.BAD_REQUEST.value()));
    }

    @ExceptionHandler(value= EntryAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ErrorResponse> handleSupplierAlreadyExistsException(EntryAlreadyExistsException e){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse(e.getMessage(),HttpStatus.CONFLICT.value()));
    }

    @ExceptionHandler(value=HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    public ResponseEntity<ErrorResponse> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e){
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(new ErrorResponse(e.getMessage(),HttpStatus.METHOD_NOT_ALLOWED.value()));
    }
}
