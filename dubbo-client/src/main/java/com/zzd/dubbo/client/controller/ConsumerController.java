package com.zzd.dubbo.client.controller;

import com.zzd.dubbo.client.facade.HelloSerivceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangzhidong
 * @date 2019-07-08 16:28
 */
@RestController
public class ConsumerController {

    @Resource
    private HelloSerivceClient helloSerivceClient;

    @GetMapping("hello")
    public String sayHello() {
        return helloSerivceClient.sayHello();
    }
}
