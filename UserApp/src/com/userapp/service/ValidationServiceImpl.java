package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		// TODO Auto-generated method stub
        if (password.length() < 6) {
            throw new TooShortException();
        } else if (password.length() > 15) {
            throw new TooLongException();
        }
        return true;

	}

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		// TODO Auto-generated method stub
        String[] usernames = {"Sri", "Priya", "Joe", "Kathy"};

        for (String name : usernames) {
            if (name.equalsIgnoreCase(username)) {
                throw new NameExistsException("Name already exists: " + username);
            }
        }
        return true;

	}

}
