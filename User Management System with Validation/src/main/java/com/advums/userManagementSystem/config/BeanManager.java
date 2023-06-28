package com.advums.userManagementSystem.config;

import com.advums.userManagementSystem.model.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<UserEntity> getInitializedList(){
        UserEntity initUser = new UserEntity(1,"Milind", LocalDate.of(1971,01,21),"milindjiboss@gmail.com","919696878725",LocalDate.of(2023,06,26), LocalTime.of(8,20,05));
        List<UserEntity> initList=new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}