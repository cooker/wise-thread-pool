package com.github.cooker.wise.util;

import java.util.concurrent.ThreadFactory;

/**
 * @author kqyu
 * 27/11/2020 5:57 下午
 * 描述：TODO
 */
public class DefaultThreadFactory implements WiseThreadFactory, ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        return null;
    }
}
