package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.SpanishGreetingRepository;

/**
 * Created by jt on 12/27/19.
 */

public class I18NSpanishService implements GreetingService {
    private final SpanishGreetingRepository spanishGreetingRepository;


    public I18NSpanishService(SpanishGreetingRepository spanishGreetingRepository) {
        this.spanishGreetingRepository = spanishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return spanishGreetingRepository.getGreeting();
    }
}
