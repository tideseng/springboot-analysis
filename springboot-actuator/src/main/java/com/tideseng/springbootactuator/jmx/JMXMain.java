package com.tideseng.springbootactuator.jmx;

import javax.management.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;

/**
 * Actuator除了REST方式发布的Endpoint，还以JMX MBean的方式发布出来，可以通过JMX(控制台输入：jconsole)来查看和管理
 * JMX全称Java Management Extensions，Java管理扩展
 *  提供了对Java应用程序和JVM的监控和管理功能
 *  通过JMX，可以监控
 *      1. 服务器中的各种资源的使用情况：CPU、内存
 *      2. JVM内存的使用情况
 *      3. JVM线程使用情况
 */
public class JMXMain {

    /**
     * 自定义JMX MBean，控制台输入：jconsole，点击定义的名称、在MBean菜单中指定的ObjectName就能查看自定义的属性和操作
     * @param args
     * @throws MalformedObjectNameException
     * @throws NotCompliantMBeanException
     * @throws InstanceAlreadyExistsException
     * @throws MBeanRegistrationException
     * @throws IOException
     */
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, IOException {
        MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName on = new ObjectName("com.tideseng.springbootactuator.jmx.Machine:type=machine");
        MachineMBean machineMBean = new Machine();
        beanServer.registerMBean(machineMBean, on);
        System.in.read();
    }

}
