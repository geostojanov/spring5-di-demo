package guru.springframework.controllers;

import guru.springframework.services.GreetingsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PIController {

    @Autowired
    public GreetingsServiceImpl greetingsService;

    public String sayHello() {
        return greetingsService.sayGreeting();
    }

}
