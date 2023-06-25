package com.model.restaurantmodel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    private Integer restaurantID;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantPhoneNumber;
    private Type restaurantSpeciality;
    private Integer totalStaff;
    private Boolean restaurantHasDeliveryService;
    private Float restaurantRating;
}
