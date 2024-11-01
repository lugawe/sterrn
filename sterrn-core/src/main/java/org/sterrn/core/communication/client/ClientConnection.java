package org.sterrn.core.communication.client;

import org.sterrn.core.communication.Message;
import org.sterrn.core.util.Result;

public interface ClientConnection {

    void connect() throws Exception;

    void disconnect() throws Exception;

    Result<Message> sendMessage(Message message, long timeout);

    Result<Message> sendMessage(Message message);

}
