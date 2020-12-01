package com.github.cooker.wise.util;

/**
 * @author kqyu
 * 27/11/2020 5:49 下午
 * 描述：
 */
public interface Shutdown extends AutoCloseable{

    default void shutdown() throws Exception {
        close();
    }
}
