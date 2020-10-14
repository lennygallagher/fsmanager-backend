package ch.gallagher.fsmanager.controller;

import ch.gallagher.fsmanager.persistence.Airport;
import ch.gallagher.fsmanager.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/airports")
public class AirportController {

    private final AirportRepository airportRepository;

    @GetMapping
    public List<Airport> getAll() {
        return airportRepository.findAll();
    }

    @Transactional
    @PostMapping
    public @ResponseBody Airport addAirport(@RequestBody Airport airport) {
        return airportRepository.save(airport);
    }

    @Transactional
    @PutMapping
    public @ResponseBody Airport updateAirport(@RequestBody Airport airport) {
        return airportRepository.save(airport);
    }

    @GetMapping("{id}")
    public @ResponseBody Airport getById(@PathVariable String id){
            return airportRepository.getById(id);
    }

    @DeleteMapping("{id}")
    public void deletetById(@PathVariable String id){
        airportRepository.deleteById(id);
    }



    @Transactional
    @GetMapping("deleteAll")
    public void deleteAll() {
        airportRepository.deleteAll();
    }
}
