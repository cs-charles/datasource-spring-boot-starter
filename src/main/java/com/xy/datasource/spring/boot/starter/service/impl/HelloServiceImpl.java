package com.xy.datasource.spring.boot.starter.service.impl;

import com.xy.datasource.spring.boot.starter.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author xieyong
 * @date 2020/3/12
 * @Description:
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello";
    }

    @Override
    public String sayInput(Object input) {
        if(input == null){
            return null;
        }
        return input.toString();
    }
}
