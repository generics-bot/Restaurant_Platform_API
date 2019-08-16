package com.generics.restaurant_platform.api.database.dish;

import com.generics.restaurant_platform.api.entities.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DishDataBaseController {

    @Autowired
    private DishTable dishTable;

    public List<Dish> getAllDishes() {
        return new ArrayList<Dish>(dishTable.findAll());
    }

    public List<Dish> getAllDishesByCategory(int categoryId) {
        return dishTable.findByCategoryId(categoryId);
    }

    public Dish findDish(String name) {
        return dishTable.findByName(name);
    }

    public Dish addDish(int categoryId, String name, String description, String price) {
        Dish dish = new Dish(categoryId, name, description, price);
        dishTable.save(dish);
        return dish;
    }
}
