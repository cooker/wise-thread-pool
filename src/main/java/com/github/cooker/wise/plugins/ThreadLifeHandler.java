package com.github.cooker.wise.plugins;

import com.github.cooker.wise.event.ThreadEvent;
import com.github.cooker.wise.event.ThreadFinishedEvent;
import com.github.cooker.wise.event.ThreadStartedEvent;

import java.util.function.Consumer;

/**
 * @author kqyu
 * 27/11/2020 5:38 下午
 * 描述：
 */
public interface ThreadLifeHandler extends Consumer<ThreadEvent> {

    void threadStartedHandle(ThreadStartedEvent event);

    void threadFinishedEvent(ThreadFinishedEvent event);

    @Override
    default void accept(ThreadEvent threadEvent) {
        if (threadEvent instanceof ThreadStartedEvent) {
            threadStartedHandle((ThreadStartedEvent) threadEvent);
        }else if (threadEvent instanceof ThreadFinishedEvent) {
            threadFinishedEvent((ThreadFinishedEvent) threadEvent);
        }
    }
}
