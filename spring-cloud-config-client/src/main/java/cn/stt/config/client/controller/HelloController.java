package cn.stt.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author shitt7
 * @Date 2019/10/30 9:26
 * @Version 1.0
 */
@RestController
public class HelloController {

    @Value("${spring.config.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
