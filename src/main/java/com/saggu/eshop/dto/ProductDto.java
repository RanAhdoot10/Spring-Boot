package com.saggu.eshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
Model Layer ---> Manages the data and business logic.
The Model object is responsible for retrieving and storing the application’s data in a database.
*/
@Data
@Builder
@AllArgsConstructor
public class ProductDto {
    private String productId;
    private String name;
    private double price;
    private String description;

}
