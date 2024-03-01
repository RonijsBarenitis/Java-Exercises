package co.develhope.SpringCustomQueries1.services;

import co.develhope.SpringCustomQueries1.entities.Flight;
import co.develhope.SpringCustomQueries1.entities.FlightStatus;
import co.develhope.SpringCustomQueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void generateListOf50(){
        List<Flight> allFlights = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            Flight newFlight = new Flight();
            newFlight.setDescription(generateRandomString());
            newFlight.setFromAirport(generateRandomString());
            newFlight.setToAirport(generateRandomString());
            newFlight.setStatus(FlightStatus.ONTIME);
            allFlights.add(newFlight);
        }
        flightRepository.saveAll(allFlights);
    }
}
