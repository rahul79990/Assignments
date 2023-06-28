package com.advums.userManagementSystem.service;

import com.advums.userManagementSystem.model.UserEntity;
import com.advums.userManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public List<UserEntity> getAllUsers(){
        return userRepo.getAllUsers();
    }

    public String addUsers(List<UserEntity> users){
        List<UserEntity> originalList=getAllUsers();
        originalList.addAll(users);
        return "New Users Added";
    }

    public String addUser(UserEntity user){
        List<UserEntity> originalList =getAllUsers();
        originalList.add(user);
        return "New user added";
    }

    public UserEntity getUserById(Integer userId){
        for(UserEntity user : userRepo.getAllUsers()){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        throw new IllegalStateException(("id not found"));
    }


    public UserEntity updateUserInfo(Integer userId, UserEntity updatedUser) {
        for (UserEntity user : userRepo.getAllUsers()) {
            if (user.getUserId().equals(userId)) {
                user.setUserName(updatedUser.getUserName());
                user.setUserDOB(updatedUser.getUserDOB());
                user.setUserEmail(updatedUser.getUserEmail());
                user.setUserPhoneNumber(updatedUser.getUserPhoneNumber());
                return user;
            }
        }
        throw new IllegalStateException("User not found for userid " + userId);
    }

    public String removeInfo(Integer userId){
        List<UserEntity> originalList= getAllUsers();
        for(UserEntity u : originalList){
            if(userId.equals(u.getUserId())){
                originalList.remove(u);
                return "User removed for UserId " + userId;
            }
        }
        return "Id not found for userId " + userId;
    }

}
