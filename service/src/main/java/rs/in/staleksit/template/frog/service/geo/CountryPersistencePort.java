package rs.in.staleksit.template.frog.service.geo;

import rs.in.staleksit.template.frog.domain.model.Country;

import java.util.Set;

public interface CountryPersistencePort {

    Set<Country> findAll();
}
