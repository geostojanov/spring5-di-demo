package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService {

    public static final String HELLO_GURUS = "Hello there! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }

}
