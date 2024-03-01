package co.develhope.SpringCustomQueries2.repositories;

import co.develhope.SpringCustomQueries2.entities.Flight;
import co.develhope.SpringCustomQueries2.entities.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findAllByStatus(FlightStatus status);

    @Query(value = "select * from Flight f where f.status = :s1 or f.status = :s2", nativeQuery = true)
    List<Flight> getFlightsByTwoStatusParams(FlightStatus s1, FlightStatus s2);
}
