package guru.springframwork.didemo.controllers;

import guru.springframwork.didemo.services.GreetingService;
import guru.springframwork.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
