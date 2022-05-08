package com.example.SMARTIQ.Service;
import com.example.SMARTIQ.Model.Car;
import com.example.SMARTIQ.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarService {

        @Autowired
        private CarRepository carRepository;

        public Car saveOrUpdateACar(Car car) {
            return carRepository.save(car);
        }

        public Car findCarById(Long carId) {
            return carRepository.getByCarId(carId);
        }

        public Iterable<Car> findAll() {
            return carRepository.findAll();
        }

    public String deleteCar(Long carId) {
        carRepository.deleteById(carId);
        return "car deleted" + carId;
    }
    public Car updateCar(Car car) {

        Car existingCar = carRepository.findById((long) car.getCarId()).orElse(null);
        existingCar.setCarBrand(car.getCarBrand());
        existingCar.setYear(car.getYear());

        return carRepository.save(existingCar);
    }
}

