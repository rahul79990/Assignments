package com.model.restaurantmodel.repository;

import com.model.restaurantmodel.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantRepo {

    private final List<Restaurant> restaurantList = new ArrayList<>();

    public List<Restaurant> getAllRestaurants() {
        return restaurantList;
    }

    public Restaurant getRestaurantById(Integer id) {
        for (Restaurant restaurant : getAllRestaurants()) {
            if(restaurant.getRestaurantID().equals(id))
            {
                return restaurant;
            }
        }
        throw new IllegalStateException("Restaurant Not found");
    }

    public void addRestaurants(List<Restaurant> restaurants) {
        List<Restaurant> originalList = getAllRestaurants();
        originalList.addAll(restaurants);
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurantList.add(restaurant);
    }

    public void updateRestaurant(Integer id, Restaurant restaurant) {
        for(Restaurant rest : restaurantList)
        {
            if(rest.getRestaurantID().equals(id))
            {
                rest.setRestaurantName(restaurant.getRestaurantName());
                rest.setRestaurantAddress(restaurant.getRestaurantAddress());
                rest.setRestaurantPhoneNumber(restaurant.getRestaurantPhoneNumber());
                rest.setTotalStaff(restaurant.getTotalStaff());
                rest.setRestaurantRating(restaurant.getRestaurantRating());
            }
        }
    }

    public void deleteRestaurant(Integer id) {
        restaurantList.removeIf(user -> user.getRestaurantID().equals(id));
    }
}
