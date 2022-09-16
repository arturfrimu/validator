package com.arturfrimu.version2;

import com.arturfrimu.version2.EnumValidator.Contains;
import com.arturfrimu.version2.EnumValidator.NotNull;
import com.arturfrimu.version2.NumberValidator.MaxLength;
import com.arturfrimu.version2.NumberValidator.MinLength;
import com.arturfrimu.version2.StringValidator.Empty;
import com.arturfrimu.version2.StringValidator.LengthBetween;

import static com.arturfrimu.version2.RequestReason.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("", "", 5, 5, CREDIT_CARD);
        System.out.println(user.isReasonValid(new LengthBetween(5, 20)));
        System.out.println(user.isBasisValid(new Empty()));
        System.out.println(user.isNumberValid(new MinLength(20), new MaxLength(5)));
        System.out.println(user.isNValid(new MinLength(20), new MaxLength(5)));
        System.out.println(user.isRequestReasonValid(new NotNull(), new Contains(OTHER_REASON, CONTRACT_MONITORING)));
    }
}
