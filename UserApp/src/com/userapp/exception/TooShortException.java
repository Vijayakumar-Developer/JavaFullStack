package com.userapp.exception;

public class TooShortException extends Exception {

    public TooShortException() {
        super("Password is too short. Minimum length is 6.");
    }

    public TooShortException(String message) {
        super(message);
    }

}
