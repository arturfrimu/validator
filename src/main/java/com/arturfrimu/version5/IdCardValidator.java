package com.arturfrimu.version5;

import java.util.Objects;

public interface IdCardValidator {
    boolean validate(String value);

    class Standard801 implements IdCardValidator {
        @Override
        public boolean validate(String value) {
            return Objects.nonNull(value) && value.length() == 13 && value.startsWith("2");
        }
    }
}
