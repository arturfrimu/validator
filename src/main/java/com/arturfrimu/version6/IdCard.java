package com.arturfrimu.version6;

public class IdCard {
    private final String idnp;

    public IdCard(String idnp) {
        this.idnp = idnp;
    }

    public ValidationResponse isValid(IdCardValidator idCardValidator) {
        return idCardValidator.validate(idnp);
    }
}
