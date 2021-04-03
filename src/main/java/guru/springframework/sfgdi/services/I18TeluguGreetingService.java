package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"TE","default"})
@Service("i18nService")
public class I18TeluguGreetingService implements GreetingService{
    public String sayGreeting(){
        return "Namaskaram --TE";
    }
}
