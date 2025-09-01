package com.voterapp.exception;

public class UnderAgeException extends NotEligibleException {
    public UnderAgeException() {
        super("Age is less than 18. You are not eligible to vote.");
    }
    public UnderAgeException(String message) {
        super(message);
    }
}
