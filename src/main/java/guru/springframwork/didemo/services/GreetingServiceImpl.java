package guru.springframwork.didemo.services;

import com.sun.xml.internal.ws.api.message.Header;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_WORLD = "Hello world!";
    @Override
    public String sayGreeting(){
        return HELLO_WORLD;
    }
}
