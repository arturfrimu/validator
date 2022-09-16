package com.arturfrimu.version4good;

import java.util.Arrays;

public class Admin {
    private final String idnp;
    private final int age;

    public Admin(String idnp, int age) {
        this.idnp = idnp;
        this.age = age;
    }

    public boolean isValidIdnp(StringValidator... validators) {
        return Arrays.stream(validators).allMatch(validator -> validator.validate(idnp));
    }
}