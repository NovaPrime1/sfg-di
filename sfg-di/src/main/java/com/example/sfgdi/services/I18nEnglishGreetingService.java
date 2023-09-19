package com.example.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingService {

    @Qualifier("I18nService")
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
