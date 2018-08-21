package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;

// Not Recommended
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }


}
