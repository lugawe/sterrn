package org.sterrn.core.communication.messages;

import org.sterrn.core.communication.Message;

import java.util.UUID;

public class ServerHelloMessage implements Message {

    private UUID id;
    private String version;

    public ServerHelloMessage() {
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
