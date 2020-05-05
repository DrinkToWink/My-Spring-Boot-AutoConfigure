package com.autoconfigure2;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 应该是会为这个类生成代理对象，并将配置文件中（以auto开头的）的属性值，注入到代理对象中
 */
@ConfigurationProperties(prefix = "auto")
public class AutoProperties {
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
