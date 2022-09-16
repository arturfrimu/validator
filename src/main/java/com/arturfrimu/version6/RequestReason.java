package com.arturfrimu.version6;

import java.util.Arrays;

public class RequestReason {
    private final String requestReason;

    public RequestReason(String requestReason) {
        this.requestReason = requestReason;
    }

    public ValidationResponse isValid(StringValidator... validators) {
        StringBuilder message = new StringBuilder();
        boolean b = Arrays.stream(validators).allMatch(validator -> {
            ValidationResponse validate = validator.validate(requestReason);
            message.append(validate.getMessage());
            return validate.isResult();
        });
        return new ValidationResponse(b, message.toString());
    }
}
