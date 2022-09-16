package com.arturfrimu.version6;

import java.util.Objects;

public interface IdCardValidator {
    ValidationResponse validate(String value);

    class Standard801 implements IdCardValidator {
        @Override
        public ValidationResponse validate(String value) {
            if (Objects.isNull(value)) {
                return new ValidationResponse(false, "IDNP cannot be null");
            } else if (value.length() != 13) {
                return new ValidationResponse(false, "IDNP don't have 13 characters");
            } else if (!value.startsWith("2")) {
                return new ValidationResponse(false, "IDNP don't start with 2");
            } else {
                return new ValidationResponse(true, "");
            }
        }
    }
}
