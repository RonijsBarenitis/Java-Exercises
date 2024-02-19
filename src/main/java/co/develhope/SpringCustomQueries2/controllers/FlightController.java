package co.develhope.SpringCustomQueries2.controllers;

import co.develhope.SpringCustomQueries2.entities.Flight;
import co.develhope.SpringCustomQueries2.repositories.FlightRepository;
import co.develhope.SpringCustomQueries2.services.FlightService;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public void generateNFlights(@RequestParam(required = false) Long n ){

        flightService.generateListOfNFligths(n);
    }

    @GetMapping("/retrieve")
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    @GetMapping("/getallpaginating")
    public Page<Flight> getAllPaginatedInASCOrder(@RequestParam Integer page, @RequestParam Integer size) {
        return flightService.getAllPaginatedInASCOrder(page, size);
    }

    @GetMapping("/getallontime")
    public List<Flight> getOnTimeFlights() {
        return flightService.getAllOnTime();
    }

    @GetMapping("/getflightstwostatus")
    public List<Flight> getFlightsByTwoStatusParams(@RequestParam (required = false) String status1, @RequestParam (required = false) String status2) {
        return flightService.getFlightsByTwoStatusParams(status1, status2);
    }
}
