package ch.gallagher.fsmanager.controller;

import ch.gallagher.fsmanager.persistence.Airport;
import ch.gallagher.fsmanager.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/airports")
public class AirportController {

    private final AirportRepository airportRepository;

    @GetMapping
    public List<Airport> getAll() {
        return List.of(Airport.builder().name("ORD").build());
    }

    @Transactional
    @GetMapping("add")
    public Airport addAirport() {
        Airport airport = Airport.builder().name("ORD").build();
        airport = airportRepository.save(airport);
        return airport;
    }

    @Transactional
    @GetMapping("deleteAll")
    public void deleteAll() {
        airportRepository.deleteAll();
    }
}
