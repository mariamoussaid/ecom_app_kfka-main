package com.med.inventoryservice.Repository;

import com.med.inventoryservice.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
