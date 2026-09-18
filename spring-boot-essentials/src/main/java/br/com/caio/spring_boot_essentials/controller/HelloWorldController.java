package br.com.caio.spring_boot_essentials.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {
//    @GetMapping
//    public ResponseEntity<String> helloWorld(){
//        return ResponseEntity.ok("Hello World");
//    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String get1(@PathVariable String id){
        return "Hello World" + id;
    }

    @GetMapping
    public ResponseEntity<String> get2(@RequestParam(value = "name", required = true) String name){
        return new ResponseEntity<>("Hello World" + name, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> post(@RequestBody String name){
        return new ResponseEntity<>("Hello world POST TESTE " + name, HttpStatus.CREATED);
    }
}
