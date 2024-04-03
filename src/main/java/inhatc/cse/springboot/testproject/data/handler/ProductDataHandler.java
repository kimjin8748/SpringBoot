package inhatc.cse.springboot.testproject.data.handler;

import inhatc.cse.springboot.testproject.data.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);

    ProductEntity getProductEntity(String productId);
}
