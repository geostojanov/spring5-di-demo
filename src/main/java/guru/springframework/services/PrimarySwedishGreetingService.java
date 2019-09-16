package guru.springframework.services;

public class PrimarySwedishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySwedishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSwedishGreeting();
    }
}
