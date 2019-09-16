package guru.springframework.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getItalianGreeting() {
        return "Ciao, sono il servizio primario italiano";
    }

    @Override
    public String getSwedishGreeting() {

        return "Hej, jag är svensk primärtjänst";

    }
}