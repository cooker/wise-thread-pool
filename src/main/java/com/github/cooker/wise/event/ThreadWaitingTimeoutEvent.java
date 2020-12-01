package com.github.cooker.wise.event;

import java.util.concurrent.TimeUnit;

/**
 * @author kqyu
 * 30/11/2020 9:08 上午
 * 描述：等待运行 Waiting for running
 */
public class ThreadWaitingTimeoutEvent extends ThreadEvent{

    long timeout;
    TimeUnit timeUnit;

    public ThreadWaitingTimeoutEvent(Object source, long timeout, TimeUnit timeUnit) {
        super(source);
        this.timeout = timeout;
        this.timeUnit = timeUnit;
    }

}
