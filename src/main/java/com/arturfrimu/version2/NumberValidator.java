package com.arturfrimu.version2;

public interface NumberValidator {
    boolean validate(long number);

    class MaxLength implements NumberValidator {
        private final long max;

        public MaxLength(long max) {
            this.max = max;
        }

        @Override
        public boolean validate(long number) {
            return number > max;
        }
    }

    class MinLength implements NumberValidator {
        private final long min;

        public MinLength(long min) {
            this.min = min;
        }

        @Override
        public boolean validate(long number) {
            return min < number;
        }
    }
}