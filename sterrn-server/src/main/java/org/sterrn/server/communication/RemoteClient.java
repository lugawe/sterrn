package org.sterrn.server.communication;

import org.sterrn.core.communication.Receiver;

import java.util.Objects;
import java.util.UUID;

public class RemoteClient implements Receiver {

    private final UUID id;

    public RemoteClient(UUID id) {
        this.id = Objects.requireNonNull(id);
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getQueueName() {
        return String.format("%s-%s", "CLIENT", getId().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RemoteClient)) return false;
        RemoteClient client = (RemoteClient) o;
        return Objects.equals(getId(), client.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
