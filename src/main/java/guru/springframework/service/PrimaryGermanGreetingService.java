package guru.springframework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    @Autowired
    public PrimaryGermanGreetingService(@Qualifier("greetingRepositoryImpl") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
