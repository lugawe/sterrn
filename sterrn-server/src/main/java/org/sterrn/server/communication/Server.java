package org.sterrn.server.communication;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.sterrn.core.communication.Participant;
import org.sterrn.core.util.Lazy;

import java.util.UUID;

@Singleton
public class Server implements Participant {

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

}
