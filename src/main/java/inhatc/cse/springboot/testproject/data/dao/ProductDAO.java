package inhatc.cse.springboot.testproject.data.dao;

import inhatc.cse.springboot.testproject.data.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);

}
