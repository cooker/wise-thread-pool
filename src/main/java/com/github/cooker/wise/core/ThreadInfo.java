package com.github.cooker.wise.core;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.management.LockInfo;

/**
 * @author kqyu
 * 27/11/2020 4:04 下午
 * 描述：
 */
@Data
@NoArgsConstructor
public class ThreadInfo {
    long id;
    String name;
    LockInfo lockInfo;
    Thread.State state;

    long blockedTime;
    long blockedCount;
    long waitedTime;
    long waitedCount;

    StackTraceElement[] stackTrace;
}
