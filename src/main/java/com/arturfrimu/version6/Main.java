package com.arturfrimu.version6;

public class Main {
    public static void main(String[] args) {
        User invalidUser = new User(new IdCard("1"), new RequestReason(""), 5);
//        Admin invalidAdmin = new Admin(new IdCard("1"), new RequestReason(""), 5);
//        User validUser = new User(new IdCard("0123456789123"), new RequestReason("I want a car"), 18);
//        Admin validAdmin = new Admin(new IdCard("0123456789123"), new RequestReason("I want a car"), 18);

        AdminValidator adminValidator = new AdminValidator();
        UserValidator userValidator = new UserValidator();
        userValidator.validate(invalidUser);
//        adminValidator.validate(invalidAdmin);
//        adminValidator.validate(validAdmin);
//        userValidator.validate(validUser);
    }
}
