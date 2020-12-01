package com.github.cooker.wise.plugins;

import com.github.cooker.wise.core.ThreadInfo;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author kqyu
 * 27/11/2020 3:25 下午
 * 描述：线程监控
 */
@FunctionalInterface
public interface MonitorHandler extends Consumer<List<ThreadInfo>> {

    void dumpThreadHandle(List<ThreadInfo> threadInfos);

    @Override
    default void accept(List<ThreadInfo> threadInfos) {
        dumpThreadHandle(threadInfos);
    }
}
