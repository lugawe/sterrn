package org.sterrn.core.communication.packets;

import org.sterrn.core.communication.Packet;
import org.sterrn.core.util.Lazy;

public class EmptyPacket implements Packet {

    private static final Lazy<EmptyPacket> instance = Lazy.of(EmptyPacket::new);

    private EmptyPacket() {
    }

    protected Object readResolve() {
        return instance.get();
    }

    public static EmptyPacket getInstance() {
        return instance.get();
    }

}
