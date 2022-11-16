package com.arqui.market.persistence.mapper;

import com.arqui.market.domain.Role;
import com.arqui.market.persistence.entity.Rol;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mappings({
            @Mapping(source = "idRol", target = "roleId"),
            @Mapping(source = "nombre", target = "name")
    })
    Role toRole(Rol rol);

    List<Role> toRoles(List<Rol> rols);

    @Mappings({
            @Mapping(target = "usuario",ignore = true)
    })
    @InheritInverseConfiguration
    Rol toRol(Role role);
}
