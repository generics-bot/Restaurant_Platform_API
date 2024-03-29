package com.generics.restaurant_platform.api.database.category;

import com.generics.restaurant_platform.api.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryDataBaseController {

    @Autowired
    private CategoryTable categoryTable;

    public void addCategory(Category category) {
        categoryTable.save(category);
    }

    public List<Category> getAllCategories() {
        return new ArrayList<>(categoryTable.findAll());
    }

    public Category findCategory(String name) {
        return categoryTable.findByName(name);
    }
}
