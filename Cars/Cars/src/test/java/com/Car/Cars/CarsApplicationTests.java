package com.Car.Cars;

import com.Car.Cars.dao.entities.Car;
import com.Car.Cars.dao.repositories.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarsApplicationTests {

	@Autowired
	CarRepository carRepository;

	@Test
	public  void  TestCreateCar() {
		Car car = new Car("Audi", "White", "BMMMS", 200 000);
		carRepository.save(car);
	}



}
