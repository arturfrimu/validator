package com.arturfrimu.version1;

public class User {
    private String reason;

    public User(String reason) {
        System.out.println("User created");
        this.reason = reason;
    }

    public boolean isReasonValid(Validator... validators) {
        boolean isValid = false;
        for (Validator validator : validators) {
            isValid = validator.validate(reason);
        }
        return isValid;
    }
}
