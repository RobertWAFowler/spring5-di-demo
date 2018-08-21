package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructerGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!!";
    }
}
