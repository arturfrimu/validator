package com.arturfrimu.version2;

import java.util.Arrays;

public class User {
    private final String reason;
    private final String basis;
    private final long number;
    private final int n;
    private final RequestReason requestReason;

    public User(String reason, String basis, long number, int n, RequestReason requestReason) {
        this.reason = reason;
        this.basis = basis;
        this.number = number;
        this.n = n;
        this.requestReason = requestReason;
    }

    public boolean isReasonValid(StringValidator... validators) {
        return Arrays.stream(validators).allMatch(validator -> validator.validate(reason));
    }

    public boolean isBasisValid(StringValidator... validators) {
        return Arrays.stream(validators).allMatch(validator -> validator.validate(basis));
    }

    public boolean isNumberValid(NumberValidator... validators) {
        return Arrays.stream(validators).allMatch(validator -> validator.validate(number));
    }

    public boolean isNValid(NumberValidator... validators) {
        return Arrays.stream(validators).allMatch(validator -> validator.validate(n));
    }

    public boolean isRequestReasonValid(EnumValidator... validators) {
        return Arrays.stream(validators).allMatch(validator -> validator.apply(requestReason));
    }
}