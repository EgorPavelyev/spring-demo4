package Config;

import jdk.jfr.Percentage;
import lab.model.Country;
import lab.model.Person;
import lab.model.UsualPerson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyConfig {

    @Bean
    public Person person(Country country) {
        return UsualPerson.builder()
                .age(35)
                .country(country)
                .name("John Smith")
                .contact("222-33-22")
                .contact("jhgsf@kjhsdf.ru")
                .contact("123476t234234")
                .height(1.72f)
                .isProgrammer(true)
                .build();
    }

    @Bean
    public Country country() {
        return Country.builder()
                .id(1)
                .codeName("RU")
                .name("Russia")
                .build();
    }
}
