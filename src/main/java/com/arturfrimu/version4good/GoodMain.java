package com.arturfrimu.version4good;

public class GoodMain {
    public static void main(String[] args) {
        Admin admin1 = new Admin("1234567890123", 20);
        Admin admin2 = new Admin("123456789012", -1);
        User user1 = new User("1234567890123", 20);
        User user2 = new User("123456789012", -1);
        AdminValidator adminValidator = new AdminValidator();
        UserValidator userValidator = new UserValidator();
        adminValidator.validate(admin1);
        adminValidator.validate(admin2);
        userValidator.validate(user1);
        userValidator.validate(user2);

    }
}
