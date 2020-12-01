package com.github.cooker.wise.annotation;

/**
 * @author kqyu
 * 30/11/2020 9:11 上午
 * 描述：
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface WaitingTimeout {
    /**
     * 进入线程池超过3秒未运行
     * @return
     */
    long timeout() default 0L;
    TimeUnit timeUnit() default TimeUnit.SECONDS;
}
