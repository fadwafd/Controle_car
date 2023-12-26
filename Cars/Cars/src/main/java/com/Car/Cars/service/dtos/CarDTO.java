package com.Car.Cars.service.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CarDTO {

    private String titre;
    private String model;
    private String color;
    private String matricul;
    private Long price;
}
