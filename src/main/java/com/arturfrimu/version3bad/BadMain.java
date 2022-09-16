package com.arturfrimu.version3bad;

public class BadMain {
    public static void main(String[] args) {
        BadAdmin admin1 = new BadAdmin("1234567890123", 20);
        BadUser user1 = new BadUser("1234567890123", 30);
        BadAdmin admin2 = new BadAdmin("123456789012", -1);
        BadUser user2 = new BadUser("123456789012", -1);
        BadAdminValidator adminValidator = new BadAdminValidator();
        BadUserValidator userValidator = new BadUserValidator();
        adminValidator.validate(admin1);
        adminValidator.validate(admin2);
        userValidator.validate(user1);
        userValidator.validate(user2);
    }
}
