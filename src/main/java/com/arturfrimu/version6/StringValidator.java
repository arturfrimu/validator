package com.arturfrimu.version6;

import java.util.Objects;

public interface StringValidator {
    ValidationResponse validate(String value);

    class Length implements StringValidator {
        private final int length;

        public Length(int length) {
            this.length = length;
        }

        @Override
        public ValidationResponse validate(String value) {
            return Objects.nonNull(value) && value.length() == length ?
                    new ValidationResponse(true, "")
                    :
                    new ValidationResponse(false, "Length expected : " + length + " | Length actual : " + value.length());
        }
    }

//    class StartWith implements StringValidator {
//        private final String word;
//
//        public StartWith(String word) {
//            this.word = word;
//        }
//
//        @Override
//        public ValidationResponse validate(String value) {
//            return Objects.nonNull(value) && value.startsWith(word);
//        }
//    }
}
