package org.sterrn.core.util;

import java.io.Serializable;
import java.util.Optional;

public final class Result<T> implements Serializable {

    private final T value;
    private final Throwable throwable;

    public Result(T value) {
        this.value = value;
        this.throwable = null;
    }

    public Result(Throwable throwable) {
        this.value = null;
        this.throwable = throwable;
    }

    public T tryGetValue() throws Throwable {
        if (throwable != null) {
            throw throwable;
        }
        return value;
    }

    public Optional<T> asOptional() {
        return Optional.ofNullable(value);
    }

    public T getValue() {
        return value;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public static <T> Result<T> of(CheckedSupplier<T> supplier) {
        try {
            return new Result<>(supplier.checkedGet());
        } catch (Throwable throwable) {
            return new Result<>(throwable);
        }
    }

    public static <T> Result<T> empty() {
        return new Result<>((T) null);
    }

}
