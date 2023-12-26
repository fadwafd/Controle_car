package com.Car.Cars.service;

import com.Car.Cars.dao.entities.Car;
import com.Car.Cars.dao.repositories.CarRepository;
import com.Car.Cars.service.dtos.CarDTO;
import com.Car.Cars.service.dtos.CarDTOInput;
import com.Car.Cars.service.mappers.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CarManagerAction {

    @Autowired
   private CarRepository carRepository;

    @Autowired
    private CarMapper carMapper;

    public CarDTO getCarByID(Long id) {
        return carMapper.fromCarToCarDto(carRepository.findById(id).get());
    }


    public void saveCar(CarDTOInput carDtoInput) {
        carMapper.fromCarDTOInputToCarDTO(carDtoInput);
    }
     public void deleteCarByID (Long id) {
        carMapper.fromCarToCarDto(carRepository.deleteById());


     }


}
