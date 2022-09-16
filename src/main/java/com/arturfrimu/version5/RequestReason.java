package com.arturfrimu.version5;

import java.util.Arrays;

public class RequestReason {
    private final String requestReason;

    public RequestReason(String requestReason) {
        this.requestReason = requestReason;
    }

    public boolean isValid(StringValidator... validators) {
        return Arrays.stream(validators).allMatch(validator -> validator.validate(requestReason));
    }
}
