package com.arqui.market.persistence.mapper;

import com.arqui.market.domain.Category;
import com.arqui.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active"),
    })
    Category toCategory(Categoria categoria);

    List<Category> toCategories(List<Categoria> categorias);
    @InheritInverseConfiguration
    //@Mapping(target = "productos", ignore = true)
    Categoria   toCategoria(Category category);



}
