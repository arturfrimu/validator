package com.arturfrimu.version6;

public class ValidationResponse {
    private final boolean result;
    private final String message;

    public ValidationResponse(boolean result, String message) {
        this.result = result;
        this.message = message;
    }

    public boolean isResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
}
