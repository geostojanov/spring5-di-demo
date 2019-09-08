package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("se")
public class PrimarySwedishGreetingService implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Hej, jag är den svenska primära tjänsten";
    }

}
