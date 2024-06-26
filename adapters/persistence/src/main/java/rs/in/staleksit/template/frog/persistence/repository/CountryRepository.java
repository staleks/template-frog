
package rs.in.staleksit.template.frog.persistence.repository;

import rs.in.staleksit.template.frog.domain.model.Country;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountryRepository {

    private static final Map<Long, Country> countries = new HashMap<>();
    static {
        Country country = Country.initCreate(1L, "admin@test.com", "Srbija", "RS", "SRB");
        countries.put(country.getId(), country);
    }

    public Set<Country> findAll() {
        return new HashSet<>(countries.values());
    }

}
