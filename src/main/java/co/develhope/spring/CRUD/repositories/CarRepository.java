package co.develhope.spring.CRUD.repositories;

import co.develhope.spring.CRUD.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
