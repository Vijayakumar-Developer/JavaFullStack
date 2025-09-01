package com.voterapp.exception;

public class NotEligibleException extends Exception {
    public NotEligibleException() {
        super("Not eligible to vote.");
    }
    public NotEligibleException(String message) {
        super(message);
    }
}
