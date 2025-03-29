package com.Bank.FirstBank.Execptions;

public class HttpRequestMethodNotSupportedException extends RuntimeException {

    public HttpRequestMethodNotSupportedException() {
    }

    public HttpRequestMethodNotSupportedException(String message) {
        super(message);
    }
}
