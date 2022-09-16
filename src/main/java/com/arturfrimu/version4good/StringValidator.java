package com.arturfrimu.version4good;

import java.util.Objects;

public interface StringValidator {
    boolean validate(String value);

    class Length implements StringValidator {
        private final int length;

        public Length(int length) {
            this.length = length;
        }

        @Override
        public boolean validate(String value) {
            return Objects.nonNull(value) && value.length() == length;
        }
    }

    class StartWith implements StringValidator {
        private final String word;

        public StartWith(String word) {
            this.word = word;
        }

        @Override
        public boolean validate(String value) {
            return Objects.nonNull(value) && value.startsWith(word);
        }
    }
}
