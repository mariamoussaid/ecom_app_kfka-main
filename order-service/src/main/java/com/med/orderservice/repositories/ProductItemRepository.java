package com.med.orderservice.repositories;

import com.med.orderservice.entites.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {

}
