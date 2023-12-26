package com.Car.Cars.web;

import com.Car.Cars.service.CarManagerAction;
import com.Car.Cars.service.dtos.CarDTO;
import com.Car.Cars.service.dtos.CarDTOInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;

public class CarGraphQLController {

    @Autowired
    private CarManagerAction carManager;

    @QueryMapping
    public CarDTO getCarById(@Argument Long id) {
        return carManager.getCarByID(id);
    }

    public  CarDTO saveCar(CarDTOInput carDtoInput){
        carManager.saveCar(carDtoInput);
        return null;
    }
}
