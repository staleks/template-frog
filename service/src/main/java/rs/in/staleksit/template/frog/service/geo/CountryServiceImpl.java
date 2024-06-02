package rs.in.staleksit.template.frog.service.geo;

import lombok.RequiredArgsConstructor;
import rs.in.staleksit.template.frog.domain.model.Country;

import java.util.Set;

@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryPersistencePort countryPersistencePort;

    @Override
    public Set<Country> findAllCountries() {
        return countryPersistencePort.findAll();
    }

}
