package com.example.SMARTIQ.Controller;

import com.example.SMARTIQ.Model.Car;
import com.example.SMARTIQ.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/car")
@CrossOrigin
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("")
    public ResponseEntity<Car> addACar(@RequestBody Car car) {
        return new ResponseEntity<Car>(carService.saveOrUpdateACar(car), HttpStatus.CREATED);
    }
    @GetMapping("")
    public Iterable<Car> getAllGalleries() {
        return carService.findAll();
    }

    @GetMapping("/{carId}")
    public ResponseEntity<Car> getCarById(@PathVariable Long carId) {
        return new ResponseEntity<Car>(carService.findCarById(carId), HttpStatus.OK);
    }
    @DeleteMapping("/{carId}")
    public String deleteCar(@PathVariable Long carId) {
        return carService.deleteCar(carId);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Car> update(@RequestBody Car car, @PathVariable Long id) {
        return new ResponseEntity<Car> (carService.updateCar(car),HttpStatus.OK);
    }
}


