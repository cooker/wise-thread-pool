package com.github.cooker.wise.core;

import com.github.cooker.wise.plugins.ExceptionHandler;
import com.github.cooker.wise.plugins.MonitorHandler;
import com.github.cooker.wise.plugins.ThreadLifeHandler;

/**
 * @author kqyu
 * 30/11/2020 8:55 上午
 * 描述：
 */
public class ThreadHandlerServiceImpl implements ThreadHandlerService{
    private ExceptionHandler exceptionHandler;

    private MonitorHandler monitorHandler;

    private ThreadLifeHandler threadLifeHandler;

    @Override
    public ExceptionHandler getExceptionHandler() {
        return exceptionHandler;
    }

    @Override
    public void setExceptionHandler(ExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }

    @Override
    public MonitorHandler getMonitorHandler() {
        return monitorHandler;
    }

    @Override
    public void setMonitorHandler(MonitorHandler monitorHandler) {
        this.monitorHandler = monitorHandler;
    }

    @Override
    public ThreadLifeHandler getThreadLifeHandler() {
        return threadLifeHandler;
    }

    @Override
    public void setThreadLifeHandler(ThreadLifeHandler threadLifeHandler) {
        this.threadLifeHandler = threadLifeHandler;
    }
}
