package com.example.GetApiandMailIntegrationApplication;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public MyObject myObject() {
        String name = "Rahul";
        int age = 24;
        return new MyObject(name, age);
    }

}