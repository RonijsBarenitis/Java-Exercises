package co.develhope.SpringInterceptor2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicController {

    @GetMapping
    public String welcomeMsg(){
        return "Hello User! This is the root mapping page";
    }
}
