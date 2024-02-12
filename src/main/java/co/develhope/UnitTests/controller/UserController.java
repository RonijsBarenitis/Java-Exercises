package co.develhope.UnitTests.controller;

import co.develhope.UnitTests.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping(path = "/")
    public @ResponseBody String defaultMessage(){
        return "This is the default message for this app";
    }

    @GetMapping(path = "/user")
    public @ResponseBody User getUser(){
        return new User("IDKdude", "mail@mail.com");
    }
}
