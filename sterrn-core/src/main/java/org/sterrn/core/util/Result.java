package org.sterrn.core.util;

import java.io.Serializable;
import java.util.Objects;
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

    public T tryGet() throws Throwable {
        if (value != null) {
            return value;
        }
        throw Objects.requireNonNull(throwable, "throwable is null");
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

}
