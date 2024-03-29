package inhatc.cse.springboot.testproject.data.repository;

import inhatc.cse.springboot.testproject.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
