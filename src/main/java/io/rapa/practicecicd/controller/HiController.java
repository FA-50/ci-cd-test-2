package io.rapa.practicecicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @GetMapping("/hi")
    public String sayHi(){
        return "hi111dd111dddd1";
    }
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
