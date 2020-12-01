package com.github.cooker.wise.core;

import com.github.cooker.wise.util.WiseThreadFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.concurrent.TimeUnit;

/**
 * @author kqyu
 * 30/11/2020 9:16 上午
 * 描述：线程描述
 */
@Getter
@AllArgsConstructor
public class ThreadRecord {

    long threadId;
    Class<WiseThreadFactory> threadFactory;

    /**
     * 入线程池时间
     */
    long entryTime;

    /**
     * 执行时间
     */
    long execTime;

    /**
     * 退出时间
     */
    long exitTime;


    /**
     * 超时时间
     */
    long timeout;
    TimeUnit timeUnit;
}
