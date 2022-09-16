package com.arturfrimu.version5;

public class UserValidator {
    public void validate(User user) {
        if (user.isIdCardValid(new IdCardValidator.Standard801())) {
            System.out.println("INVALID");
        } else if (user.isRequestReasonValid(new StringValidator.Length(10))) {
            System.out.println("IDNP need to start with 2");
        }
//        if (user.getAge() < 0 || user.getAge() > 130) {
//            System.out.println("Age need to be between 0 and 130");
//        }
    }
}
