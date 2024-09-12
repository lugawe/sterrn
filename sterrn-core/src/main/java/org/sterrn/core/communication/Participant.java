package org.sterrn.core.communication;

import java.io.Serializable;
import java.util.UUID;

public interface Participant extends Serializable {

    UUID getId();

    String getQueueName();

}
