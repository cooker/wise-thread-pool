package com.github.cooker.wise.util;

import java.util.concurrent.ThreadFactory;

/**
 * @author grant
 * 27/11/2020 3:20 下午
 * 描述：
 */
public enum DaemonThreadFactory implements WiseThreadFactory, ThreadFactory {
    INSTANCE;

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setDaemon(true);
        return ThreadWrapper.wrap(th);
    }
}
