package hello;


/**
 * Created by hahse on 1.12.2016.
 */

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(path = "/izzet" , method = RequestMethod.POST)
    public String poster(@RequestHeader String izzet){
        return izzet +" merhaba!";
    }

}