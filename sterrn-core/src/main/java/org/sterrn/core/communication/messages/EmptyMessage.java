package org.sterrn.core.communication.messages;

import org.sterrn.core.communication.Message;
import org.sterrn.core.util.Lazy;

public class EmptyMessage implements Message {

    private static final Lazy<EmptyMessage> instance = Lazy.of(EmptyMessage::new);

    private EmptyMessage() {
    }

    protected Object readResolve() {
        return instance.get();
    }

    public static EmptyMessage getInstance() {
        return instance.get();
    }

}
