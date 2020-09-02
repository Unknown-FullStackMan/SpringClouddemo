package com.mxt.feign.Impl;

import com.mxt.entity.Student;
import com.mxt.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;


@Component //这个注解把FeignError注入到IOC容器中
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中。。。。。";
    }
}
