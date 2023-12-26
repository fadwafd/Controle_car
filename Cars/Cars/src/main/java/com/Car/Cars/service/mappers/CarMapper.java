package com.Car.Cars.service.mappers;

import com.Car.Cars.dao.entities.Car;
import com.Car.Cars.service.dtos.CarDTO;
import com.Car.Cars.service.dtos.CarDTOInput;
import org.modelmapper.ModelMapper;

public class CarMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public Car fromCarDtoToCar(CarDTO carDto) {
        return this.modelMapper.map( carDto, Car.class);
    }

    public CarDTO fromCarToCarDto(Car car) {
        return this.modelMapper.map(car, CarDTO.class);
    }
    public CarDTO fromCarDTOInputToCarDTO(CarDTOInput carDtoInput) {
        return this.modelMapper.map(carDtoInput, CarDTO.class);
    }

    public CarDTOInput fromCarDTOToCarDTOInput(CarDTO carDTO) {
        return this.modelMapper.map(carDTO, CarDTOInput.class);
    }

    public Car fromCarToCarDTO(Car carDtoInput) {
        return this.modelMapper.map(carDtoInput, Car.class);
    }

}
