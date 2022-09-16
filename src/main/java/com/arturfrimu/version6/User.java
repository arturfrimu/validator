package com.arturfrimu.version6;

public class User {
    private final IdCard idCard;
    private final RequestReason requestReason;
    private final int age;

    public User(IdCard IdCard, RequestReason requestReason, int age) {
        this.idCard = IdCard;
        this.requestReason = requestReason;
        this.age = age;
    }

    public ValidationResponse isRequestReasonValid(StringValidator... validators) {
        return requestReason.isValid(validators);
    }

    public ValidationResponse isIdCardValid(IdCardValidator validators) {
        return idCard.isValid(validators);
    }
}
