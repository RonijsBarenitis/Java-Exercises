package co.develhope.SpringCustomQueries1.controllers;

import co.develhope.SpringCustomQueries1.entities.Flight;
import co.develhope.SpringCustomQueries1.repositories.FlightRepository;
import co.develhope.SpringCustomQueries1.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private FlightService flightService;

    @GetMapping("/provisioning")
    public void generate50Flights(){
        flightService.generateListOf50();
    }

    @GetMapping("/retrieve")
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }
}
