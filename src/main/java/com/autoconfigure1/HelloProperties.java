package com.autoconfigure1;

import org.springframework.boot.context.properties.ConfigurationProperties;

//将类的属性通过配置文件注入，默认是全局的配置文件，当然也可以用其他注解来自定义配置文件
@ConfigurationProperties(prefix = "auto.hello")
public class HelloProperties {

    private String prefix;

    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
