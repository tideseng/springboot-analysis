package com.tideseng.springbootactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 健康检查actuator
 * 检查地址
 *  http://localhost:8899/actuator
 *      {
 * 			"_links": {
 * 				"self": {
 * 					"href": "http://localhost:8080/actuator",
 * 					"templated": false
 * 				},
 * 				"health-component-instance": {
 * 					"href": "http://localhost:8080/actuator/health/{component}/{instance}",
 * 					"templated": true
 * 				},
 * 				"health-component": {
 * 					"href": "http://localhost:8080/actuator/health/{component}",
 * 					"templated": true
 * 				},
 * 				"health": {
 * 					"href": "http://localhost:8080/actuator/health",
 * 					"templated": false
 * 				},
 * 				"info": {
 * 					"href": "http://localhost:8080/actuator/info",
 * 					"templated": false
 *              }
 *          }
 * 		}
 * 	http://localhost:8080/actuator/health // 当设置为显示详情时，可看到数据库、内存的信息
 * 	    {"status":"UP"}
 * 健康检查原理
 *      基于Spring Boot自动装配载入spring.factories中的HealthIndicatorAutoConfiguration
 *      还提供了常见的服务监控：DataSourceHealthIndicator、DiskSpaceHealthIndicator、RedisHealthIndicator等
 */
@SpringBootApplication
public class SpringbootActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootActuatorApplication.class, args);
    }

}
