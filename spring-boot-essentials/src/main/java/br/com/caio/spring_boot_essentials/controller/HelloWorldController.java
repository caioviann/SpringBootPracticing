package br.com.caio.spring_boot_essentials.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {
//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public String helloWorld(){
//        return "Hello World";
//    }

//    @GetMapping
//    public ResponseEntity<String> helloWorld(){
//        return ResponseEntity.ok("Hello World");
//    }

    @GetMapping
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}
