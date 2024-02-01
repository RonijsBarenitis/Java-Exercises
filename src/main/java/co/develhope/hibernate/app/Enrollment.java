package co.develhope.hibernate.app;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table

public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    @ManyToOne
    private Classes classes;
}
