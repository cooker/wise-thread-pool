package com.github.cooker.wise.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.concurrent.TimeUnit;

/**
 * @author kqyu
 * 1/12/2020 10:01 上午
 * 描述：等待超时
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Timeout {
    @NonNull long timeout;
    @NonNull TimeUnit unit;
}
