package guru.springframework.controllers;

import guru.springframework.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PIController {

    @Autowired
    public GreetingsService greetingsServiceImpl;

    public String sayHello() {
        return greetingsServiceImpl.sayGreeting();
    }

}
