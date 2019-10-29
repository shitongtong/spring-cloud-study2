package cn.stt.consul.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName FeignHelloService
 * @Description TODO
 * @Author shitt7
 * @Date 2019/10/29 8:21
 * @Version 1.0
 */
@FeignClient("service-producer")
public interface FeignHelloService {

    @RequestMapping("/hello")
    public String hello();
}
