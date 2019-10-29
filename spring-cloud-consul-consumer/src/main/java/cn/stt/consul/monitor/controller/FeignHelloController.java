package cn.stt.consul.monitor.controller;

import cn.stt.consul.monitor.service.FeignHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FeignHelloController
 * @Description TODO
 * @Author shitt7
 * @Date 2019/10/29 8:23
 * @Version 1.0
 */
@RestController
public class FeignHelloController {
    @Autowired
    private FeignHelloService feignHelloService;

    @RequestMapping("/feign/call")
    public String call() {
        // 像调用本地服务一样
        return feignHelloService.hello();
    }
}
