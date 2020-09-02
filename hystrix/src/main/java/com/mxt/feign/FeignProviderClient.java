package com.mxt.feign;

import com.mxt.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;


@FeignClient(value = "provider")
public interface FeignProviderClient {

    @GetMapping("/Student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/Student/index")
    public String index();
}
