package com.xy.datasource.spring.boot.starter.dao;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xieyong
 * @date 2019/10/23
 * @Description:
 */
@ConfigurationProperties(prefix = "xy.spring.datasource")
@Data
public class DataSource {

    private String url;

    private String username;

    private String password;
}
