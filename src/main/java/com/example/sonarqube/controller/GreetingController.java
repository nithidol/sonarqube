package com.example.sonarqube.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping(path = "/greeting")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("Hello world!!");
    }

}
