package com.arturfrimu.version6;

import com.arturfrimu.version6.IdCardValidator.Standard801;
import com.arturfrimu.version6.StringValidator.Length;

public class UserValidator {
    public void validate(User user) {
        ValidationResponse idCardValid = user.isIdCardValid(new Standard801());
        ValidationResponse requestReasonValid = user.isRequestReasonValid(new Length(10));
        if (!idCardValid.isResult()) {
            System.out.println(idCardValid.getMessage());
        }
        if (!requestReasonValid.isResult()) {
            System.out.println(requestReasonValid.getMessage());
        }
    }
}
