package org.sterrn.client.communication;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.sterrn.core.communication.Sender;
import org.sterrn.core.util.Lazy;

import java.util.Objects;
import java.util.UUID;

@Singleton
public class Client implements Sender {

    private final Lazy<UUID> id = Lazy.of(UUID::randomUUID);

    @Inject
    public Client() {
    }

    @Override
    public UUID getId() {
        return id.get();
    }

    @Override
    public String getQueueName() {
        return String.format("%s-%s", "CLIENT", getId().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(getId(), client.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
