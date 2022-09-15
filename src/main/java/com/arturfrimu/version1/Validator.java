package com.arturfrimu.version1;

public interface Validator {
    boolean validate(String str);

    class StringBetweenValidator implements Validator {
        private int maxLength;
        private int minLength;

        public StringBetweenValidator(int minLength, int maxLength) {
            System.out.println("StringBetweenValidator created");
            this.minLength = minLength;
            this.maxLength = maxLength;
        }

        @Override
        public boolean validate(String str) {
            return str != null && minLength < str.length() && str.length() < maxLength;
        }
    }

    class StringEmptyValidator implements Validator {
        public StringEmptyValidator() {
            System.out.println("StringEmptyValidator created");
        }

        @Override
        public boolean validate(String str) {
            return str != null && str.length() > 0;
        }
    }

    class StringGreaterThanValidator implements Validator {
        private int maxLength;

        public StringGreaterThanValidator(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public boolean validate(String str) {
            return str != null && str.length() > maxLength;
        }
    }
}