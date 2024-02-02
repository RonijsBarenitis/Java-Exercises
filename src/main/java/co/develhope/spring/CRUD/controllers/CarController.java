package co.develhope.spring.CRUD.controllers;

import co.develhope.spring.CRUD.entities.Car;
import co.develhope.spring.CRUD.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping(path = "/addcar")
    public Car createCar(@RequestBody Car car){
        Car carAdded = carRepository.saveAndFlush(car);
        return carAdded;
    }

    @GetMapping(path = "/getallcars")
    public List<Car> getAll(){
        List<Car> allCars = carRepository.findAll();
        return allCars;
    }

    @GetMapping(path = "/getcar{id}")
    public Car getOneById(@PathVariable Long id){
        if(!carRepository.existsById(id)){
            return new Car();
        }
        Car car = carRepository.getById(id);
        return car;
    }

    @PutMapping(path = "/updatetype{id}")
    public Car updateOne(@PathVariable Long id, @RequestParam String type){
        if (carRepository.existsById(id)) {
            Car newCar = getOneById(id);
            newCar.setType(type);
            return carRepository.saveAndFlush(newCar);
        } else {
            return new Car();
        }
    }

    @DeleteMapping(path = "/delete{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") String id) {
        boolean carExists = carRepository.existsById(Long.valueOf(id));

        if (carExists) {
            carRepository.deleteById(Long.valueOf(id));
            return new ResponseEntity<>("Car deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Error, a car with that ID doesn't exist", HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping(path = "/deleteall")
    public void deleteAll(){
        carRepository.deleteAll();
    }
}
