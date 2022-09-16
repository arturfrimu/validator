package com.arturfrimu.version1;

import java.util.Objects;

public interface Validator {
    boolean validate(String str);

    class LengthBetween implements Validator {
        private final int maxLength;
        private final int minLength;

        public LengthBetween(int minLength, int maxLength) {
            this.minLength = minLength;
            this.maxLength = maxLength;
        }

        @Override
        public boolean validate(String str) {
            return Objects.nonNull(str) && minLength < str.length() && str.length() < maxLength;
        }
    }

    class Empty implements Validator {
        @Override
        public boolean validate(String str) {
            return Objects.nonNull(str) && str.length() > 0;
        }
    }

    class GreaterThan implements Validator {
        private final int maxLength;

        public GreaterThan(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public boolean validate(String str) {
            return Objects.nonNull(str) && str.length() > maxLength;
        }
    }
}