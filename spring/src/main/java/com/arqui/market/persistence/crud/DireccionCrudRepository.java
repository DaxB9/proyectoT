package com.arqui.market.persistence.crud;

import com.arqui.market.persistence.entity.Direccion;
import com.arqui.market.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DireccionCrudRepository extends CrudRepository<Direccion, Integer> {
    List<Direccion> findByIdUsuario(String idUsuario);
}


