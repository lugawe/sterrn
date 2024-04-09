package org.sterrn.core.communication.packets;

import org.sterrn.core.communication.Packet;

public class AlivePacket implements Packet {

    private long timestamp;

    public AlivePacket() {
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

}
