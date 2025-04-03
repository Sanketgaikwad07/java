// GreetingController.java (Controller Class)

package com.example.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST controller
public class GreetingController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, Spring Boot!";
    }
}
