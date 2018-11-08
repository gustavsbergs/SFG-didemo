package guru.springframwork.didemo.controllers;

import guru.springframwork.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//WHAT NOT TO DO:
@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServiceImpl greetingService;
    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
