package org.sterrn.core.util;

public final class ExceptionUtils {

    private ExceptionUtils() {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> T sneakyThrow0(Throwable throwable) throws T {
        if (throwable == null) {
            throw new NullPointerException("throwable is null");
        }
        throw (T) throwable;
    }

    public static RuntimeException sneakyThrow(Throwable throwable) {
        return sneakyThrow0(throwable);
    }

}
