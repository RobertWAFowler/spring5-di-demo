package guru.springframework.controllers;

import guru.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Not Recommended
@Controller
public class PropertyInjectedController {

    @Qualifier("greetingServiceImpl")
    @Autowired
    public GreetingService greetingService;             // Here be dragons!!!

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
