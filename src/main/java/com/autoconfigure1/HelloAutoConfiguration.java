package com.autoconfigure1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 声明为配置类,这个类在配置文件/META-INF/spring.factories中配置过了，
 * 项目启动时，会自动加载这个类
 * @ConditionalOnWebApplication 判断是否是web应用
 * @EnableConfigurationProperties(HelloProperties.class) 让这个HelloProperties.class生效
 * */
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

//    @Autowired
//    HelloProperties helloProperties;

    @Bean//容器中有HelloProperties的对象，则会自动将对象注入到形参helloProperties中
    public HelloService helloService(HelloProperties helloProperties){
        HelloService helloService = new HelloService();
        helloService.setHelloProperties(helloProperties);
        return helloService;
    }
}
