package rs.in.staleksit.template.frog.persistence.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.in.staleksit.template.frog.persistence.adapter.CountryPersistenceAdapter;
import rs.in.staleksit.template.frog.persistence.repository.CountryRepository;
import rs.in.staleksit.template.frog.service.geo.CountryPersistencePort;

@Configuration
public class PersistenceConfig {

    @Bean
    CountryRepository countryRepository() {
        return new CountryRepository();
    }

    @Bean
    CountryPersistencePort countryPersistencePort(final CountryRepository countryRepository) {
        return new CountryPersistenceAdapter(countryRepository);
    }

}
