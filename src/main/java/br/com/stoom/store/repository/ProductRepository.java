package br.com.stoom.store.repository;

import br.com.stoom.store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

//SELECT * FROM product p JOIN category c ON p.category_id = c.category_id WHERE c.description = 'description';
    @Query("SELECT p FROM Product p WHERE p.category.description = :category")
    List<Product> findByCategoryDescription(@Param("category") String category);


    @Query("SELECT p FROM Product p WHERE p.brand.name = :brand")
    List<Product> findByBrandName(@Param("brand") String brand);
}
