package guru.springframework.controllers;

import guru.springframework.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CIController {
    private GreetingsService greetingsService;


    public CIController(@Qualifier("constructorGreetingService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.sayGreeting();
    }

}
