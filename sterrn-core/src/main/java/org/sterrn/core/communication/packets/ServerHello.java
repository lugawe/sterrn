package org.sterrn.core.communication.packets;

import org.sterrn.core.communication.Packet;

import java.util.UUID;

public class ServerHello implements Packet {

    private UUID id;
    private String version;

    public ServerHello() {
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
