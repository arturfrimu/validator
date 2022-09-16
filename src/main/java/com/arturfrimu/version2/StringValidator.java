package com.arturfrimu.version2;

import java.util.Objects;

public interface StringValidator {
    boolean validate(String str);

    class Empty implements StringValidator {
        @Override
        public boolean validate(String value) {
            return Objects.nonNull(value) && value.length() > 0;
        }
    }

    class LengthBetween implements StringValidator {
        private final int min;
        private final int max;

        public LengthBetween(int min, int max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public boolean validate(String value) {
            return min < value.length() && value.length() < max;
        }
    }
}