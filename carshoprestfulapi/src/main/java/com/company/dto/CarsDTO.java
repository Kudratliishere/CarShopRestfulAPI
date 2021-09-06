package com.company.dto;

import com.company.entity.Cars;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Dunay Gudratli
 */
@Getter
@Setter
@NoArgsConstructor
public class CarsDTO
{

    private Integer id;
    private String number;
    private ModelDTO model;
    private ColorDTO color;
    private ShapeDTO shape;
    
    public static CarsDTO of (Cars cars)
    {
        CarsDTO carsDTO = new CarsDTO();
        carsDTO.setId(cars.getId());
        carsDTO.setNumber(cars.getNumber());
        carsDTO.setModel(ModelDTO.of(cars.getModel()));
        carsDTO.setColor(ColorDTO.of(cars.getColor()));
        carsDTO.setShape(ShapeDTO.of(cars.getShape()));
        
        return carsDTO;
    }
}
