package com.github.cooker.wise.core;

import com.github.cooker.wise.util.Shutdown;
import lombok.extern.slf4j.Slf4j;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * @author kqyu
 * 27/11/2020 4:30 下午
 * 描述：
 */
@Slf4j
public class ThreadManager extends ThreadHandlerServiceImpl implements Shutdown , ThreadHandlerService {

    public static List<ThreadInfo> dumpThreadInfo()
    {

        if (log.isDebugEnabled()) {
            log.debug("线程dump 打印 >>>");
        }
        final ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] ids = threadMXBean.getAllThreadIds();

        return LongStream.of(ids)

                .mapToObj(id->{
                    java.lang.management.ThreadInfo threadInfo = threadMXBean.getThreadInfo(id);
                    if (log.isDebugEnabled()) {
                        log.debug("{}", threadInfo);
                    }
                    com.github.cooker.wise.core.ThreadInfo t = new com.github.cooker.wise.core.ThreadInfo();

                    t.setName(threadInfo.getThreadName());
                    t.setId(threadInfo.getThreadId());
                    t.setLockInfo(threadInfo.getLockInfo());
                    t.setState(threadInfo.getThreadState());

                    t.setBlockedCount(threadInfo.getBlockedCount());
                    t.setBlockedTime(threadInfo.getBlockedTime());
                    t.setWaitedCount(threadInfo.getWaitedTime());
                    t.setWaitedTime(threadInfo.getWaitedTime());
                    t.setStackTrace(threadInfo.getStackTrace());
                    return t;

                }).collect(Collectors.toList());
    }

    @Override
    public void close() throws Exception {

    }
}
