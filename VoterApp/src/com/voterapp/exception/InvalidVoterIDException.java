package com.voterapp.exception;

public class InvalidVoterIDException extends NotEligibleException {
    public InvalidVoterIDException() {
        super("Voter ID must be a 4-digit number between 1000 and 9999.");
    }
    public InvalidVoterIDException(String message) {
        super(message);
    }
}
