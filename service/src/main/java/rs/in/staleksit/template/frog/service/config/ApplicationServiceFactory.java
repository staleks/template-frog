package rs.in.staleksit.template.frog.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.in.staleksit.template.frog.service.geo.CountryService;
import rs.in.staleksit.template.frog.service.geo.CountryServiceImpl;

@Configuration
public class ApplicationServiceFactory {

    @Bean
    CountryService countryService() {
        return new CountryServiceImpl();
    }

}
