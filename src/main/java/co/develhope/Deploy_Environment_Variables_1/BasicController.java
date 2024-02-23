package co.develhope.Deploy_Environment_Variables_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String getMsg(){
        String devName = environment.getProperty("myCustomVarTree.devName");
        String authCode = environment.getProperty("myCustomVarTree.authCode");
        return "Hello " +devName +"! Your authentication code is: " +authCode;
    }

}
