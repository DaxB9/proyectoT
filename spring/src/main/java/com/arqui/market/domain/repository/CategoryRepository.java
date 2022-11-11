package com.arqui.market.domain.repository;


import com.arqui.market.domain.Category;


import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    List<Category> getAll();
    Optional<Category> getCategory(int categoryId);
    Category save(Category category);
    void delete(int categoryId);
}
