package cn.stt.consul.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RibbonHelloController
 * @Description TODO
 * @Author shitt7
 * @Date 2019/10/28 16:49
 * @Version 1.0
 */
@RestController
public class RibbonHelloController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbon/call")
    public String call() {
        // 调用服务, service-producer为注册的服务名称，LoadBalancerInterceptor会拦截调用并根据服务名找到对应的服务
        String callServiceResult = restTemplate.getForObject("http://service-producer/hello", String.class);
        return callServiceResult;
    }
}
