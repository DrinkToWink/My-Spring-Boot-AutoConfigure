package com.autoconfigure2;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AutoProperties.class)
public class AutoConfiguration {

    @Bean//会将AutoProperties类的对象注入到形参autoProperties中
    public Auto auto(AutoProperties autoProperties){
        System.out.println(autoProperties);
        return new Auto(autoProperties.getPrefix(),autoProperties.getSuffix());
    }
}
