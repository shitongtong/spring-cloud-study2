package cn.stt.consul.monitor.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName FeignHelloHystrix
 * @Description TODO
 * @Author shitt7
 * @Date 2019/10/29 8:40
 * @Version 1.0
 */
@Component
public class FeignHelloHystrix implements FeignHelloService {

    @RequestMapping("/hello")
    @Override
    public String hello() {
        return "sorry, this service call failed.";
    }
}
