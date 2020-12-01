package com.github.cooker.wise.event;

import java.util.EventObject;

/**
 * @author kqyu
 * 27/11/2020 5:42 下午
 * 描述：
 */
public abstract class ThreadEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ThreadEvent(Object source) {
        super(source);
    }
}
