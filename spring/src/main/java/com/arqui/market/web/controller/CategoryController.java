package com.arqui.market.web.controller;

import com.arqui.market.domain.Category;
import com.arqui.market.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }
    @GetMapping("/{categoryId}")
    public Optional<Category> getCategory(@PathVariable("categoryId")int categoryId){
        return categoryService.getCategory(categoryId);
    }
    @PostMapping("/save")
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }
    @DeleteMapping("/delete/{categoryId}")
    public Boolean delete(@PathVariable("categoryId") int categoryId){
        return categoryService.delete(categoryId);
    }
}
