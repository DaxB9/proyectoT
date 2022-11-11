package com.arqui.market.domain.service;

import com.arqui.market.domain.Category;
import com.arqui.market.persistence.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Category> getAll(){
        return categoriaRepository.getAll();
    }

    public Optional<Category> getCategory(int categoryId){
        return categoriaRepository.getCategory(categoryId);
    }

    public Category save(Category category){
        return categoriaRepository.save(category);
    }

    public Boolean delete(int categoryId){
        return getCategory(categoryId).map(category -> {
            categoriaRepository.delete(categoryId);
            return true;
        }).orElse(false);
    }

}
