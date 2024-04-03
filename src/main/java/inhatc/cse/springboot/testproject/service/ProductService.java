package inhatc.cse.springboot.testproject.service;

import inhatc.cse.springboot.testproject.data.dto.ProductDTO;

public interface ProductService {

    ProductDTO saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDTO getProduct(String productId);
}
