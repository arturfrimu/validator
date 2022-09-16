package com.arturfrimu.version2;

import java.util.Arrays;
import java.util.Objects;

public interface EnumValidator<T extends Enum> {
    boolean apply(T object);

    class Contains<T extends Enum> implements EnumValidator<T> {
        private final T[] enums;

        protected Contains(T... enums) {
            this.enums = enums;
        }

        @Override
        public final boolean apply(T e) {
            return Arrays.asList(enums).contains(e);
        }
    }

    class NotNull<T extends Enum> implements EnumValidator<T> {
        @Override
        public boolean apply(T object) {
            return Objects.nonNull(object);
        }
    }
}
