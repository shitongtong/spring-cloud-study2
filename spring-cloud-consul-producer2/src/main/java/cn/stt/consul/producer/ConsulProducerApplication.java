package cn.stt.consul.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ConsulProducerApplication
 * @Description TODO
 * @Author shitt7
 * @Date 2019/10/28 16:05
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulProducerApplication.class, args);
    }
}
