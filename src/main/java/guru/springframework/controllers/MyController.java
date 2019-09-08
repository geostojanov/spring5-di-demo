package guru.springframework.controllers;

import guru.springframework.services.GreetingsService;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {

    private GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String hello() {
        System.out.println("Helloooo!!! ");
        return greetingsService.sayGreeting();
    }
}
