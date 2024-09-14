package org.sterrn.client.communication;

import org.sterrn.core.communication.Receiver;

import java.util.Objects;
import java.util.UUID;

public class RemoteServer implements Receiver {

    private final UUID id;

    public RemoteServer(UUID id) {
        this.id = Objects.requireNonNull(id);
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getQueueName() {
        return String.format("%s-%s", "SERVER", getId().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RemoteServer)) return false;
        RemoteServer server = (RemoteServer) o;
        return Objects.equals(getId(), server.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
