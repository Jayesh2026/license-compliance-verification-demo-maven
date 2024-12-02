package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    
    @GetMapping("/")
    public ResponseEntity<String> greetings(){
        return ResponseEntity.ok("Hello World! Your most welcome here...");
    }
}