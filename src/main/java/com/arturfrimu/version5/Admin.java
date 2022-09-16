package com.arturfrimu.version5;

public class Admin {
    private final IdCard idCard;
    private final RequestReason requestReason;
    private final int age;

    public Admin(IdCard IdCard, RequestReason requestReason, int age) {
        this.idCard = IdCard;
        this.requestReason = requestReason;
        this.age = age;
    }

    public boolean isRequestReasonValid(StringValidator... validators) {
        return requestReason.isValid(validators);
    }

    public boolean isIdCardValid(IdCardValidator validators) {
        return idCard.isValid(validators);
    }
}
