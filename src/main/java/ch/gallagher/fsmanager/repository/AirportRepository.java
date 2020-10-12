package ch.gallagher.fsmanager.repository;

import ch.gallagher.fsmanager.persistence.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, String> {
    Airport getById(String id);
}
