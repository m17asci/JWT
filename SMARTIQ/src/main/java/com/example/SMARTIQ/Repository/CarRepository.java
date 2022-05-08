package com.example.SMARTIQ.Repository;
import com.example.SMARTIQ.Model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car,Long> {
    Car getByCarId (Long carId);

}
