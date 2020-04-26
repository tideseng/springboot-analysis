package com.tideseng.format.starter.format;

public interface FormatProcessor {

    /**
     * 格式化
     * @param obj
     * @param <T>
     * @return
     */
    <T> String format(T obj);

}
