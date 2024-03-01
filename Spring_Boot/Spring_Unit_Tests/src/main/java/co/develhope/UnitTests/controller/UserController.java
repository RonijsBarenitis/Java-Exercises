package co.develhope.UnitTests.controller;

import co.develhope.UnitTests.entities.User;
import co.develhope.UnitTests.repositories.UserRepository;
import co.develhope.UnitTests.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping(path = "/")
    public @ResponseBody String defaultMessage(){
        return "This is the default message for this app";
    }

    /*@GetMapping(path = "/create")
    public @ResponseBody User getSingle(){
        return new User("IDKdude", "mail@mail.com");
    }*/

    @PostMapping(path = "/create")
    public @ResponseBody User createUser(@RequestBody User user) {

        return userRepository.save(user);
    }


    @GetMapping(path = "/getAll")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/get{id}")
    public @ResponseBody User getSingle(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }else {
            return null;
        }
    }

    @PutMapping(path = "/updateusername/{id}")
    public User update(@PathVariable Long id, @RequestParam String newUserName) {
        return userService.updateUserName(id, newUserName);
    }

    @PatchMapping(path = "/updateemail/{id}")
    public User updateEmail(@PathVariable Long id, @RequestParam String email) {
        return userService.updateEmail(id, email);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable Long id){
        userRepository.deleteById(id);
    }
}
