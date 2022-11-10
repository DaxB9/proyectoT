package com.arqui.market.persistence.crud;

import com.arqui.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    // FORMA NATIVA: @Query(value = "SELECT * FROM producto WHERE id_producto = ?",nativeQuery = true)
    List<Producto> findByIdCategoria(int idCategoria);
    Optional<List<Producto>> findByCantidadLessThanAndEstado(int cantidad, int estado);


}
