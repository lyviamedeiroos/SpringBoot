package com.uniesp.aula1.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorld {

    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World!";
    }
}
