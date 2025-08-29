package com.userapp.exception;

public class TooLongException extends Exception {

    public TooLongException() {
        super("Password is too long. Maximum length is 15.");
    }

    public TooLongException(String message) {
        super(message);
    }

}
