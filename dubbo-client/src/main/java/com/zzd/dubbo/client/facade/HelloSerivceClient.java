package com.zzd.dubbo.client.facade;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzd.dubbo.api.inter.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author zhangzhidong
 * @date 2019-07-09 18:13
 */
@Service
public class HelloSerivceClient {


    @Reference
    private HelloService helloService;

    public String sayHello() {
        return helloService.sayHello();
    }
}
