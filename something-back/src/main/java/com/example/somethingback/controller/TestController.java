package com.example.somethingback.controller;

import com.example.somethingback.dto.TestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/{name}")
    public ResponseEntity<TestDto> test(@PathVariable("name") String name){
        return ResponseEntity.ok(new TestDto(name, "test@naver.com"));
    }
}
