package com.saggu.eshop.dao;

// dao means data access object
// dto means data transfer object
import com.saggu.eshop.dto.ProductDto;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

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

