package com.arqui.market.persistence.crud;


import com.arqui.market.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<Usuario, String> {

}
