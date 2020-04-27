package com.tideseng.springbootactuator.jmx;

public class Machine implements MachineMBean{

    @Override
    public int getCpuCore() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public long getFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    @Override
    public void shutdown() {
        System.exit(0);
    }
}
