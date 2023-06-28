package com.advums.userManagementSystem.repository;

import com.advums.userManagementSystem.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private List<UserEntity> users;

    public List<UserEntity> getAllUsers() {
        return users;
    }
}
