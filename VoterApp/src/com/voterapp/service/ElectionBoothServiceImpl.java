package com.voterapp.service;

import com.voterapp.exception.*;

public class ElectionBoothServiceImpl implements IElectionBoothService {

    @Override
    public boolean checkEligibility(int age, String locality, int voterId) throws NotEligibleException {
        if (checkAge(age) && checkLocality(locality) && checkVoterId(voterId)) {
            return true;
        }
        return false;
    }

    private boolean checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException();
        }
        return true;
    }

    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        String[] localities = {"Chennai", "trichy", "mumbai"};
        for (String loc : localities) {
            if (loc.equalsIgnoreCase(locality)) {
                return true;
            }
        }
        throw new LocalityNotFoundException();
    }

    private boolean checkVoterId(int voterId) throws InvalidVoterIDException {
        if (voterId < 1000 || voterId > 9999) {
            throw new InvalidVoterIDException();
        }
        return true;
    }
}
