package com.Car.Cars.service;

import com.Car.Cars.service.dtos.CarDTO;
import com.Car.Cars.service.dtos.CarDTOInput;

public interface CarManager {

    public CarDTO getCarByID(Long id);

    public CarDTO saveCar(CarDTOInput carDtoInput);

    public void deleteCarByID (Long id);
}
