package com.Bank.FirstBank.Execptions;

public class MethodArgumentNotValidException extends RuntimeException {

    public MethodArgumentNotValidException() {
    }

    public MethodArgumentNotValidException(String message) {
        super(message);
    }
}
