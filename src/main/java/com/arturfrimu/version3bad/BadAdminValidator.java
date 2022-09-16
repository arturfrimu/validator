package com.arturfrimu.version3bad;

public class BadAdminValidator {
    public void validate(BadAdmin admin) {
        if (admin.getIdnp().length() != 13) {
            System.out.println("IDNP length need to be 13");
        }
        if (admin.getAge() < 0 || admin.getAge() > 130) {
            System.out.println("Age need to be between 0 and 130");
        }
    }
}
