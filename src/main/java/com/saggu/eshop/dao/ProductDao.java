package com.saggu.eshop.dao;

// dao means data access object
// dto means data transfer object
import com.saggu.eshop.dto.ProductDto;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

/*
View Layer ---> Handles the display and user interface.
Responsible for presenting the data obtained from the Model. It represents the visual representation or user interface of the application.
The View layer generates the output of the application and communicates it to the client.
The requested data is fetched from the Model layer by the Controller and passed to the View for rendering and display to the user or client.
*/
@Repository
public class ProductDao
{
    private final List<ProductDto> productList = new ArrayList<>();
    static int id = 100;

    public ProductDao() {
        productList.add(ProductDto.builder().productId(createAndGetId()).name("Sony 4K TV 65").price(2849.99).description("Sony LED 4k Smart TV").build());
        productList.add(ProductDto.builder().productId(createAndGetId()).name("Sony 4K TV 55").price(1849.99).description("Sony LED 4k Smart TV").build());
    }

    public List<ProductDto> getProducts() {
        return productList;
    }

    private String createAndGetId() {
        return "P" + id++;
    }

    public ProductDto addProduct(ProductDto product) {
        product.setProductId(createAndGetId());
        productList.add(product);
        return product;
    }
}

