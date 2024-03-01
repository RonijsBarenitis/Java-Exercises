package co.develhope.Deploy_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/v1")
public class BasicController {

    @GetMapping("/nums")
    public String sumTwoRandomIntegers(){
        Random random = new Random();
        Integer min = 1;
        Integer max = 100;
        Integer int1 = random.nextInt(max - min) + min;
        Integer int2 = random.nextInt(max - min) + min;
        Integer sum = int1 + int2;
        return "The sum of 2 randomly generated integers: " +int1 +"+" +int2 +"=" +sum;
    }
}
