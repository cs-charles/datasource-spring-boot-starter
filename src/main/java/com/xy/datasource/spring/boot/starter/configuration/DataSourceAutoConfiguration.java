package com.xy.datasource.spring.boot.starter.configuration;

import com.xy.datasource.spring.boot.starter.annotation.DatabaseType;
import com.xy.datasource.spring.boot.starter.dao.DataSource;
import com.xy.datasource.spring.boot.starter.service.DataSourceService;
import com.xy.datasource.spring.boot.starter.service.impl.MySQLDataSourceService;
import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xieyong
 * @date 2019/10/23
 * @Description:
 */
@Configuration
@ConditionalOnClass(DataSourceService.class)  //上下文中存在此类的class文件
@EnableConfigurationProperties(DataSource.class) //让配置类生效
public class DataSourceAutoConfiguration {

    /**
     * 功能描述 托管给spring
     * @author xieyong
     * @return
     */
    @Bean
    @ConditionalOnMissingBean  //上下文中缺少DataSourceService的Bean
    @DatabaseType("MYSQL")
    public DataSourceService getDataSourceService()
    {
        return new MySQLDataSourceService();
    }

    /**
     *
     * 还可有oracle 等其他实现类
     */
}
