package inhatc.cse.springboot.testproject.data.dao.impl;

import inhatc.cse.springboot.testproject.data.dao.ProductDAO;
import inhatc.cse.springboot.testproject.data.entity.ProductEntity;
import inhatc.cse.springboot.testproject.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDAOImpl implements ProductDAO {

    ProductRepository productRepository;

    @Autowired //자동으로 연결시켜주는 어노테이션
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId){
        ProductEntity productEntity = productRepository.getReferenceById(productId);
        return productEntity;
    }
}
