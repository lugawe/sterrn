package org.sterrn.core.communication.messages;

import org.sterrn.core.communication.Message;

public class AliveMessage implements Message {

    private long timestamp;

    public AliveMessage() {
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

}
