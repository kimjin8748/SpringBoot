package inhatc.cse.springboot.testproject.service.impl;

import inhatc.cse.springboot.testproject.data.dto.ProductDTO;
import inhatc.cse.springboot.testproject.data.entity.ProductEntity;
import inhatc.cse.springboot.testproject.data.handler.ProductDataHandler;
import inhatc.cse.springboot.testproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    ProductDataHandler productDataHandler;

    @Autowired
    public ProductServiceImpl(ProductDataHandler productDataHandler) {
        this.productDataHandler = productDataHandler;
    }

    @Override
    public ProductDTO saveProduct(String productId, String productName, int productPrice, int productStock){
        ProductEntity productEntity = productDataHandler.saveProductEntity(productId, productName, productPrice, productStock);

        ProductDTO productDTO = new ProductDTO(productEntity.getProductId(),
                productEntity.getProductName(), productEntity.getProductPrice(), productEntity.getProductStock());

        return productDTO;
    }

    @Override
    public ProductDTO getProduct(String productId) {
        ProductEntity productEntity = productDataHandler.getProductEntity(productId);

        ProductDTO productDTO = new ProductDTO(productEntity.getProductId(),
                productEntity.getProductName(), productEntity.getProductPrice(), productEntity.getProductStock());

        return productDTO;
    }


}
