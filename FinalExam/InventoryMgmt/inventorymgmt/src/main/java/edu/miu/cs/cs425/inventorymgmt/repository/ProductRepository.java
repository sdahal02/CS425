package edu.miu.cs.cs425.inventorymgmt.repository;

import edu.miu.cs.cs425.inventorymgmt.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
