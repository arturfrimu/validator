package com.arturfrimu.version6;

public class AdminValidator {
    public void validate(Admin admin) {
        ValidationResponse idCardValid = admin.isIdCardValid(new IdCardValidator.Standard801());
        ValidationResponse requestReasonValid = admin.isRequestReasonValid(new StringValidator.Length(10));
        if (!idCardValid.isResult()) {
            System.out.println(idCardValid.getMessage());
        }
        if (!requestReasonValid.isResult()) {
            System.out.println(requestReasonValid.getMessage());
        }
    }
}
