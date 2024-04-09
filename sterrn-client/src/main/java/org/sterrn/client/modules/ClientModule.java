package org.sterrn.client.modules;

import com.google.inject.AbstractModule;
import org.sterrn.client.communication.Client;
import org.sterrn.core.communication.Sender;

public class ClientModule extends AbstractModule {

    public ClientModule() {
    }

    @Override
    protected void configure() {
        bind(Sender.class).to(Client.class);
    }

}
