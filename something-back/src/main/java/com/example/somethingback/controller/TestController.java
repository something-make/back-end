package com.example.somethingback.controller;

import com.example.somethingback.domain.TestDomain;
import com.example.somethingback.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/a")
    public ResponseEntity<String> test2(){
        return ResponseEntity.ok("hello");
    }

    @GetMapping("/{name}/{age}")
    public ResponseEntity<String> test(@PathVariable("name") String name, @PathVariable("age") int age){
        return ResponseEntity.ok(name + " is " + age);
    }

    @GetMapping("/domains")
    public ResponseEntity<List<TestDomain>> getAll(){
        return ResponseEntity.ok(testService.findAll());
    }
}

