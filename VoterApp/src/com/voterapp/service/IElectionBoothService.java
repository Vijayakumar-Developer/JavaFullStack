package com.voterapp.service;

import com.voterapp.exception.NotEligibleException;

public interface IElectionBoothService {
    boolean checkEligibility(int age, String locality, int voterId) throws NotEligibleException;
}
