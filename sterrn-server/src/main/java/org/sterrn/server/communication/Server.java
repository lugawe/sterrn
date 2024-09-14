package org.sterrn.server.communication;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.sterrn.core.communication.Sender;
import org.sterrn.core.util.Lazy;

import java.util.Objects;
import java.util.UUID;

@Singleton
public class Server implements Sender {

    private final Lazy<UUID> id = Lazy.of(UUID::randomUUID);

    @Inject
    public Server() {
    }

    @Override
    public UUID getId() {
        return id.get();
    }

    @Override
    public String getQueueName() {
        return String.format("%s-%s", "SERVER", getId().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Server)) return false;
        Server server = (Server) o;
        return Objects.equals(getId(), server.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
