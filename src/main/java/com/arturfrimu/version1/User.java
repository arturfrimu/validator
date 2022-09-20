package com.arturfrimu.version1;

import java.util.Arrays;

public class User {
    private String reason;

    public User(String reason) {
        System.out.println("User created");
        this.reason = reason;
    }

    public boolean isReasonValid(Validator... validators) {
        return Arrays.stream(validators).allMatch(validator -> validator.validate(reason));
    }
}
