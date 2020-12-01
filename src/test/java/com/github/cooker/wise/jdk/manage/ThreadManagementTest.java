package com.github.cooker.wise.jdk.manage;

import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.stream.LongStream;

/**
 * @author kqyu
 * 27/11/2020 4:57 下午
 * 描述：
 */
public class ThreadManagementTest {
    @Test
    public void threadInfo(){
        final ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        Thread thread = new Thread(()->{
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
        long[] ids = threadMXBean.getAllThreadIds();
        LongStream.of(ids).forEach(id->{
            ThreadInfo threadInfo = threadMXBean.getThreadInfo(id);
            System.out.println(threadInfo);
        });
    }
}
