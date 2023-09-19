package com.example.sfgdi.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("I18nService")
public class I18nSpanishGreetingService implements GreetingService {

    @Qualifier("i18nService")
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
