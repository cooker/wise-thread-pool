package com.github.cooker.wise.core;

import com.github.cooker.wise.plugins.ExceptionHandler;
import com.github.cooker.wise.plugins.MonitorHandler;
import com.github.cooker.wise.plugins.ThreadLifeHandler;

/**
 * @author kqyu
 * 30/11/2020 8:54 上午
 * 描述：
 */
public interface ThreadHandlerService {

    ExceptionHandler getExceptionHandler();
    void setExceptionHandler(ExceptionHandler exceptionHandler);

    MonitorHandler getMonitorHandler();
    void setMonitorHandler(MonitorHandler monitorHandler);

    ThreadLifeHandler getThreadLifeHandler();
    void setThreadLifeHandler(ThreadLifeHandler threadLifeHandler);

}
