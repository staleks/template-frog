package rs.in.staleksit.template.frog.web.endpoint;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.in.staleksit.template.frog.domain.model.Country;
import rs.in.staleksit.template.frog.service.geo.CountryService;

import java.util.Set;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CountryController {

    private static final String COUNTRIES_ENDPOINT = "/api/countries";

    private final CountryService countryService;

    @GetMapping(path = COUNTRIES_ENDPOINT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<Country>> getCountries() {
        log.info("Getting countries");
        return ResponseEntity.ok(countryService.findAllCountries());
    }

}
