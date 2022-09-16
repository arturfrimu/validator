package com.arturfrimu.version4good;

import com.arturfrimu.version4good.StringValidator.Length;
import com.arturfrimu.version4good.StringValidator.StartWith;

public class UserValidator {
    public void validate(User user) {
        if (user.isValidIdnp(new Length(13))) {
            System.out.println("IDNP length need to be 13");
        } else if (user.isValidIdnp(new StartWith("2"))) {
            System.out.println("IDNP need to start with 2");
        }
//        if (user.getAge() < 0 || user.getAge() > 130) {
//            System.out.println("Age need to be between 0 and 130");
//        }
    }
}
