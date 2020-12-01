package com.github.cooker.wise.event;


/**
 * @author kqyu
 * 27/11/2020 5:24 下午
 * 描述：
 */
public abstract class ThreadStartedEvent extends ThreadEvent {


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ThreadStartedEvent(Object source) {
        super(source);
    }
}
