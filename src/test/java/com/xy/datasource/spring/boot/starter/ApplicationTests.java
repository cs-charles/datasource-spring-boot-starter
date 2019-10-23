package com.xy.datasource.spring.boot.starter;

import com.xy.datasource.spring.boot.starter.service.DataSourceService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ApplicationTests {

    @Autowired
    private DataSourceService dataSourceService;


    @Test
    public void test() {
        dataSourceService.dataSource();
    }


}
