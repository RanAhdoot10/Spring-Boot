package com.saggu.eshop.dao;

import com.saggu.eshop.dto.ProductDto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ProductDaoTest {

    @Test
    void givenPrePopulatedData_getProducts_ShouldReturnAProductList() {
        ProductDao dao = new ProductDao();
        assertThat(dao.getProducts().size()).isEqualTo(2);
    }

    @Test
    void givenANewProductDto_addProducts_ShouldAddAndReturnDtoWithProdId() {
        ProductDao dao = new ProductDao();
        assertThat(dao.getProducts().size()).isEqualTo(2);
        ProductDto productSamsung = ProductDto.builder().name("Sony 4K TV 75").price(3849.99).description("Sony LED 4k Smart TV").build();

        ProductDto createdDto = dao.addProduct(productSamsung);

        assertThat(dao.getProducts().size()).isEqualTo(3);
        assertThat(createdDto.getProductId()).isNotNull();
    }
}