package com.tideseng.springbootactuator.jmx;

/**
 * 把需要发布出去的指标信息,通过MB来进行发布
 */
public interface MachineMBean {

    int getCpuCore();

    long getFreeMemory();

    void shutdown();
}
