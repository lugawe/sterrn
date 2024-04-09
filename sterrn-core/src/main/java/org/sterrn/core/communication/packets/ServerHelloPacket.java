package org.sterrn.core.communication.packets;

import org.sterrn.core.communication.Packet;

import java.util.UUID;

public class ServerHelloPacket implements Packet {

    private UUID id;
    private String version;

    public ServerHelloPacket() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
