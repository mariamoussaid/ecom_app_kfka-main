package com.med.orderservice.repositories;

import com.med.orderservice.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {

}
