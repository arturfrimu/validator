package com.arturfrimu.version6;

public class UserValidator {
    public void validate(User user) {
        ValidationResponse idCardValid = user.isIdCardValid(new IdCardValidator.Standard801());
        ValidationResponse requestReasonValid = user.isRequestReasonValid(new StringValidator.Length(10));
        if (!idCardValid.isResult()) {
            System.out.println(idCardValid.getMessage());
        }
        if (!requestReasonValid.isResult()) {
            System.out.println(requestReasonValid.getMessage());
        }
    }
}
