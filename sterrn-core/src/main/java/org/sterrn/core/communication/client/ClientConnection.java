package org.sterrn.core.communication.client;

public interface ClientConnection {

    void connect() throws Exception;

    void disconnect() throws Exception;

}
