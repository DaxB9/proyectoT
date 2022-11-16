package com.arqui.market.persistence;

import com.arqui.market.domain.Role;
import com.arqui.market.domain.repository.RoleRepository;
import com.arqui.market.persistence.crud.RolCrudRepository;
import com.arqui.market.persistence.entity.Rol;
import com.arqui.market.persistence.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RolRepository implements RoleRepository {

    @Autowired
    private RolCrudRepository rolCrudRepository;
    @Autowired
    private RoleMapper mapper;

    @Override
    public List<Role> getAll() {
        List<Rol> rols = (List<Rol>) rolCrudRepository.findAll();
        return mapper.toRoles(rols);
    }

    @Override
    public Role save(Role role) {
        Rol rol = mapper.toRol(role);
        return mapper.toRole(rolCrudRepository.save(rol));
    }
}
