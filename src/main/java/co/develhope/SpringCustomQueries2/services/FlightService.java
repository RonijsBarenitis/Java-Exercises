package co.develhope.SpringCustomQueries2.services;

import co.develhope.SpringCustomQueries2.entities.Flight;
import co.develhope.SpringCustomQueries2.entities.FlightStatus;
import co.develhope.SpringCustomQueries2.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    public void generateListOfNFligths(Long n){
        if(n == null){
            n = 100L;
        }
        List<Flight> allFlights = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Flight newFlight = new Flight();
            newFlight.setDescription(generateRandomString());
            newFlight.setFromAirport(generateRandomString());
            newFlight.setToAirport(generateRandomString());
            newFlight.setStatus(getRandomFlightStatusValue());
            allFlights.add(newFlight);
        }
        flightRepository.saveAll(allFlights);
    }

    public FlightStatus getRandomFlightStatusValue(){
        return FlightStatus.values()[new Random().nextInt(FlightStatus.values().length)];
    }

    public Page<Flight> getAllPaginatedInASCOrder(Integer page, Integer size) {
        return flightRepository.findAll(PageRequest.of(page, size, Sort.by("fromAirport").ascending()));
    }

    public List<Flight> getAllOnTime() {
        return flightRepository.findAllByStatus(FlightStatus.ONTIME);
    }

    public List<Flight> getFlightsByTwoStatusParams(FlightStatus s1, FlightStatus s2) {
        return flightRepository.getFlightsByTwoStatusParams(s1,s2);
    }
}
