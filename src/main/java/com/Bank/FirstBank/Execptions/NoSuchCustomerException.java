package com.Bank.FirstBank.Execptions;

public class NoSuchCustomerException extends RuntimeException {

    public NoSuchCustomerException() {
    }

    public NoSuchCustomerException(String message) {
        super(message);
    }
}
