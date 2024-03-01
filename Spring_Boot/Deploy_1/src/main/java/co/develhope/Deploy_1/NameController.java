package co.develhope.Deploy_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class NameController {

    @Value("${devName}")
    String devName;

    @GetMapping("/name")
    public String getName(){
        return "Hello " +devName +"!";
    }
}
