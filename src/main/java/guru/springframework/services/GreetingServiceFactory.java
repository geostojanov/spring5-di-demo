package guru.springframework.services;


public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingsService(String lang) {

        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "it":
                return new PrimaryItalianGreetingService(greetingRepository);
            case "se":
                return new PrimarySwedishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }

    }
}
