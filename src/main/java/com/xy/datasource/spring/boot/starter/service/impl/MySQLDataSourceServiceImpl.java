package com.xy.datasource.spring.boot.starter.service.impl;

import com.xy.datasource.spring.boot.starter.dao.DataSource;
import com.xy.datasource.spring.boot.starter.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xieyong
 * @date 2019/10/23
 * @Description:
 */

public class MySQLDataSourceServiceImpl implements DataSourceService {

    @Autowired
    DataSource dataSource;

    @Override
    public String dataSource() {
        System.out.println("datasource type: MYSQL");
        System.out.println("datasource url:"+dataSource.getUrl()
                +"\t datasource username:"+dataSource.getUsername()
                +"\t datasource password:"+dataSource.getPassword());
        return "mysql";
    }
}
