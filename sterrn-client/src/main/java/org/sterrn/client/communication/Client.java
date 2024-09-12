package org.sterrn.client.communication;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.sterrn.core.communication.Participant;
import org.sterrn.core.util.Lazy;

import java.util.UUID;

@Singleton
public class Client implements Participant {

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

}
