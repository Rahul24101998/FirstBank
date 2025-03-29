package com.Bank.FirstBank.Execptions;

public class EntryAlreadyExistsException extends RuntimeException {

    public EntryAlreadyExistsException() {
    }

    public EntryAlreadyExistsException(String message) {
        super(message);
    }
}
