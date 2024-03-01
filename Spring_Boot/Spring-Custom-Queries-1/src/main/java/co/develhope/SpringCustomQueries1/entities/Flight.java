package co.develhope.SpringCustomQueries1.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private String fromAirport;

    private String toAirport;

    private Enum<FlightStatus> status;
}
