package org.sterrn.server.modules;

import com.google.inject.AbstractModule;
import org.sterrn.core.communication.Sender;
import org.sterrn.core.communication.server.MessageBroker;
import org.sterrn.server.activemq.ActiveMQMessageBroker;
import org.sterrn.server.communication.Server;

public class ServerModule extends AbstractModule {

    public ServerModule() {
    }

    @Override
    protected void configure() {
        bind(Sender.class).to(Server.class);
        bind(MessageBroker.class).to(ActiveMQMessageBroker.class);
    }

}
