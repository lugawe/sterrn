package org.sterrn.core.util;

import java.util.function.Supplier;

@FunctionalInterface
public interface CheckedSupplier<T> extends Supplier<T> {

    T checkedGet() throws Exception;

    @Override
    default T get() {
        try {
            return checkedGet();
        } catch (Exception e) {
            throw ExceptionUtils.sneakyThrow(e);
        }
    }

}
