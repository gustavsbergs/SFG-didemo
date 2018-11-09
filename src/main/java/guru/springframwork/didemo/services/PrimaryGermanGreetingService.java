package guru.springframwork.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {
    public String sayGreeting(){
        return "Primarer Deutsches hallo!";
    }
}
