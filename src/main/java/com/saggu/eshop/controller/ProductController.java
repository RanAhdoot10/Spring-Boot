package com.saggu.eshop.controller;

import com.saggu.eshop.dao.ProductDao;
import com.saggu.eshop.dto.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/*
Controller Layer ---> Manages user input and interactions, and updates the Model and View.
Receives user requests from the View layer and handles them, including necessary validations and logic.
It serves as the intermediary between the Model and View components.
The Controller processes the user requests and forwards them to the Model layer for data processing.
*/
@RestController
public class ProductController
{
    private final ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @GetMapping(value = "/products")
    public List<ProductDto> products() {
        return productDao.getProducts();
    }

    @PostMapping(value = "/products")
    public ResponseEntity<ProductDto> addProducts(@RequestBody ProductDto productDto) {
        ProductDto createdDto = productDao.addProduct(productDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDto);
    }
}
