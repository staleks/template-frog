package rs.in.staleksit.template.frog.persistence.adapter;

import lombok.RequiredArgsConstructor;
import rs.in.staleksit.template.frog.domain.model.Country;
import rs.in.staleksit.template.frog.persistence.repository.CountryRepository;
import rs.in.staleksit.template.frog.service.geo.CountryPersistencePort;

import java.util.Set;

@RequiredArgsConstructor
public class CountryPersistenceAdapter implements CountryPersistencePort {

    private final CountryRepository countryRepository;

    @Override
    public Set<Country> findAll() {
        return countryRepository.findAll();
    }
}
