package com.userapp.exception;

public class NameExistsException extends Exception {

    public NameExistsException() {
        super("Name already exists");
    }

    public NameExistsException(String message) {
        super(message);
    }


}
