package com.arturfrimu.version5;

import java.util.Arrays;

public class IdCard {
    private final String idnp;

    public IdCard(String idnp) {
        this.idnp = idnp;
    }

    public boolean isValid(IdCardValidator idCardValidator) {
        return idCardValidator.validate(idnp);
    }
}
