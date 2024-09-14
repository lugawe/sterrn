package org.sterrn.core.communication.jms;

import jakarta.jms.MessageListener;
import jakarta.jms.Session;

public interface SessionMessageListener extends MessageListener {

    Session getSession();

}
