package org.sterrn.core.communication.packets;

import org.sterrn.core.communication.Packet;

public class ThrowablePacket implements Packet {

    private Throwable throwable;

    public ThrowablePacket() {
    }

    public ThrowablePacket(Throwable throwable) {
        this.throwable = throwable;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

}
