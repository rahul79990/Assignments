package com.Ecommerce.eCommerce.repository;

import com.Ecommerce.eCommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User , Integer> {

    User findUserById(Integer id);
}
