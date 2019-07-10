package com.zzd.dubbo.server;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zhangzhidong
 * @date 2019-07-08 15:51
 */
@SpringBootApplication
public class ProviderStarter {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderStarter.class).web(WebApplicationType.NONE).run(args);
    }
}
