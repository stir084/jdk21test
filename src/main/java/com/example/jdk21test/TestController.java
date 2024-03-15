package com.example.jdk21test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep(50);
        return "test";
    }
    //https://gatling.io/open-source
}
