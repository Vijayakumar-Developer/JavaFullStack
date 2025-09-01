package com.voterapp.exception;

public class LocalityNotFoundException extends NotEligibleException {
    public LocalityNotFoundException() {
        super("Your locality is not listed in the voter records.");
    }
    public LocalityNotFoundException(String message) {
        super(message);
    }
}
