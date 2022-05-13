package guru.springframework.sfgdi.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class SpanishGreetingRepositoryImpl implements SpanishGreetingRepository {


    @Override
    public String getGreeting() {
        return "Hola Mundo - EN";
    }
}
