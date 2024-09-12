package org.sterrn.server.managed;

import io.dropwizard.lifecycle.Managed;
import jakarta.inject.Inject;
import org.sterrn.core.communication.server.MessageBroker;

public class MessageBrokerManaged implements Managed {

    private final MessageBroker messageBroker;

    @Inject
    public MessageBrokerManaged(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }

    @Override
    public void start() throws Exception {
        messageBroker.start();
    }

    @Override
    public void stop() throws Exception {
        messageBroker.stop();
    }

}
