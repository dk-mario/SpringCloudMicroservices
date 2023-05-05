package ru.javabegin.micro.demo.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dmitry Kartsev
 */
@RestController
@RequestMapping("/main") // корневой URI
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping("/test")
    public String test() {
        return "testing microservices instance on id: " + id;
    }
}
