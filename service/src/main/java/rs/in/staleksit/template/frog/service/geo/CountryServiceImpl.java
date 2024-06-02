package rs.in.staleksit.template.frog.service.geo;

import rs.in.staleksit.template.frog.domain.model.Country;

import java.util.HashSet;
import java.util.Set;

public class CountryServiceImpl implements CountryService {

    @Override
    public Set<Country> findAllCountries() {
        Set<Country> countries = new HashSet<>();
        countries.add(Country.create("admin@test.com", "Srbija", "RS", "SRB"));
        return countries;
    }

}
