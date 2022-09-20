package com.arturfrimu.version5;

import com.arturfrimu.version5.IdCardValidator.Standard801;

public class AdminValidator {
    public void validate(Admin admin) {
        if (!admin.isIdCardValid(new Standard801())) {
            System.out.println("INVALID");
        } else if (!admin.isRequestReasonValid(new StringValidator.Length(10))) {
            System.out.println("IDNP need to start with 2");
        }
//        if (admin.getAge() < 0 || admin.getAge() > 130) {
//            System.out.println("Age need to be between 0 and 130");
//        }
    }
}
