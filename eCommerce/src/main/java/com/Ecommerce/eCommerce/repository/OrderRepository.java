package com.Ecommerce.eCommerce.repository;

import com.Ecommerce.eCommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order , Integer> {
}
