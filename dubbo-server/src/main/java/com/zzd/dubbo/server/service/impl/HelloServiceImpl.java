package com.zzd.dubbo.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzd.dubbo.api.inter.HelloService;

/**
 * @author zhangzhidong
 * @date 2019-07-08 15:57
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "hello, world!";
    }
}
