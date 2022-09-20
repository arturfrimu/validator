package com.arturfrimu.version4good;

import com.arturfrimu.version4good.StringValidator.Length;
import com.arturfrimu.version4good.StringValidator.StartWith;

public class AdminValidator {
    public void validate(Admin admin) {
        if (admin.isValidIdnp(new Length(13), new StartWith("2"))) {
            System.out.println("IDNP length need to be 13");
        } else if (admin.isValidIdnp(new StartWith("2"))) {
            System.out.println("IDNP need to start with 2");
        }
//        if (admin.getAge() < 0 || admin.getAge() > 130) {
//            System.out.println("Age need to be between 0 and 130");
//        }
    }
}
