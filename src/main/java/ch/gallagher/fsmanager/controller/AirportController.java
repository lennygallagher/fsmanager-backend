package ch.gallagher.fsmanager.controller;

import ch.gallagher.fsmanager.persistence.Airport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airports")
public class AirportController {

    @GetMapping
    public List<Airport> getAll() {

        return List.of(Airport.builder().name("ORD").build());
    }
}
