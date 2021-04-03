package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {

        return "Hello from Primary greeting";
    }
}
