package cn.stt.consul.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName ConsulMonitorApplication
 * @Description TODO
 * @Author shitt7
 * @Date 2019/10/28 16:05
 * @Version 1.0
 */
@EnableZuulProxy
@SpringBootApplication
public class ConsulZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulZuulApplication.class, args);
    }
}
