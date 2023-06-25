package com.model.restaurantmodel.service;

import com.model.restaurantmodel.model.Restaurant;
import com.model.restaurantmodel.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private final RestaurantRepo restaurantRepo;

    public RestaurantService(RestaurantRepo restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.getAllRestaurants();
    }

    public Restaurant getRestaurantById(Integer id) {
        return restaurantRepo.getRestaurantById(id);
    }

    public String addRestaurants(List<Restaurant> restaurants) {
        restaurantRepo.addRestaurants(restaurants);
        return "Restaurants added successfully";
    }

    public String addRestaurant(Restaurant restaurant) {
        restaurantRepo.addRestaurant(restaurant);
        return "Restaurant added successfully";
    }

    public String updateRestaurant(Integer id , Restaurant restaurant) {
        restaurantRepo.updateRestaurant(id , restaurant);
        return "Restaurant updated successfully";
    }

    public String deleteRestaurant(Integer id) {
        restaurantRepo.deleteRestaurant(id);
        return "Restaurant deleted successfully";
    }
}
