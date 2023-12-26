package com.Car.Cars.dao.repositories;

import com.Car.Cars.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
