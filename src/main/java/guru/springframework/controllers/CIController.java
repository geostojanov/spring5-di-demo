package guru.springframework.controllers;

import guru.springframework.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class CIController {
    private GreetingsService greetingsService;

    public CIController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.sayGreeting();
    }

}
