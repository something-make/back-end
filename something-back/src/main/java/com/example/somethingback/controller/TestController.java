package com.example.somethingback.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/a")
    public ResponseEntity<String> test2(){
        return ResponseEntity.ok("hello");
    }

    @GetMapping("/{name}/{age}")
    public ResponseEntity<String> test(@PathVariable("name") String name, @PathVariable("age") int age){
        return ResponseEntity.ok(name + " is " + age);
    }

}

