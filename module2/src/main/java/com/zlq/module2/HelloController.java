package com.zlq.module2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController{
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Soing Bott2!";
    }
}