package org.sterrn.core.communication.messages;

import org.sterrn.core.communication.Message;

public class ThrowableMessage implements Message {

    private Throwable throwable;

    public ThrowableMessage() {
    }

    public ThrowableMessage(Throwable throwable) {
        this.throwable = throwable;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
