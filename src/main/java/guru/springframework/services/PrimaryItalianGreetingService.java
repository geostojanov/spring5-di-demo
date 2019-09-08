package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("it")
@Primary
public class PrimaryItalianGreetingService implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Buongiorno, sono il principale servizio italiano.";
    }

}
