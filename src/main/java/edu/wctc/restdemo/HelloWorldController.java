package edu.wctc.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/hello")
    public String[] sayHello() {
        return  new String[] {"Hello world!", "Goodbye!"};
    }
}
