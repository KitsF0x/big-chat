package io.github.kitsf0x.bigchatbackend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloController {
    @CrossOrigin(origins = "http://localhost:5173/")
    @GetMapping("/hello/{hello}")
    public String hello(@PathVariable("hello") String hello) {
        return "Hello" + hello + "!";
    }
}
