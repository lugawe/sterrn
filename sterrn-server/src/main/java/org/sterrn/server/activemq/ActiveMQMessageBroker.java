package org.sterrn.server.activemq;

import jakarta.inject.Inject;
import org.apache.activemq.broker.BrokerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sterrn.core.communication.server.MessageBroker;

public class ActiveMQMessageBroker implements MessageBroker {

    public static final String MESSAGE_BROKER_NAME = "sterrn-server-activemq_message_broker";

    private static final Logger log = LoggerFactory.getLogger(ActiveMQMessageBroker.class);

    private final BrokerService brokerService = new BrokerService();

    @Inject
    public ActiveMQMessageBroker() {
    }

    @Override
    public void start() throws Exception {
        log.info("start");
        brokerService.setBrokerName(MESSAGE_BROKER_NAME);
        brokerService.addConnector("tcp://localhost:61616");
        brokerService.setPersistent(false);
        brokerService.start();
    }

    @Override
    public void stop() throws Exception {
        log.info("stop");
        brokerService.stop();
    }

}
