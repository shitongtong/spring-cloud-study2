package cn.stt.consul.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @ClassName ConsulMonitorApplication
 * @Description TODO
 * @Author shitt7
 * @Date 2019/10/28 16:05
 * @Version 1.0
 */
@EnableTurbine
@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class ConsulMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulMonitorApplication.class, args);
    }
}
