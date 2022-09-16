package com.arturfrimu.version3bad;

public class BadUserValidator {
    public void validate(BadUser user) {
        if (user.getIdnp().length() != 13) {
            System.out.println("IDNP length need to be 13");
        } else if (!user.getIdnp().startsWith("2")) {
            System.out.println("IDNP need to start with 2");
        }
        if (user.getAge() < 0 || user.getAge() > 130) {
            System.out.println("Age need to be between 0 and 130");
        }
    }
}
