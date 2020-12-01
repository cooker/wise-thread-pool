package com.github.cooker.wise.plugins;

import java.util.function.Consumer;

/**
 * @author kqyu
 * 27/11/2020 3:29 下午
 * 描述：异常处理
 */
@FunctionalInterface
public interface ExceptionHandler extends Consumer<Exception> {

    void errorHandle(Exception e);

    @Override
    default void accept(Exception e) {
        errorHandle(e);
    }
}
