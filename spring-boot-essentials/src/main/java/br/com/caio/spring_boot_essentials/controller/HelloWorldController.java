package br.com.caio.spring_boot_essentials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {
    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
}
