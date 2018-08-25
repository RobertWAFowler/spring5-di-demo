package guru.springframework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    @Autowired
    public PrimarySpanishGreetingService(@Qualifier("greetingRepositoryImpl") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
