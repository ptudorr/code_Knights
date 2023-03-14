package criticscorner.back.criticscorner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CriticscornerController {

    @RequestMapping("/hello")
    String hello() {
        return "Hello World, Spring Boot here!";
    }
}
