package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello I was injected by the setter.";
    }
}
