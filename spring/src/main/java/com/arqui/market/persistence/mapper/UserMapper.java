package com.arqui.market.persistence.mapper;

import com.arqui.market.domain.User;
import com.arqui.market.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {RoleMapper.class})
public interface UserMapper {

    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "apellido",target = "lastname"),
            @Mapping(source = "celular",target = "phone"),
            @Mapping(source = "correo",target = "email"),
            @Mapping(source = "estado",target = "active"),
            @Mapping(source = "usuario",target = "username"),
//            @Mapping(source = "password",target = "password"),
//            @Mapping(source = "rol",target = "roles"),
    })
    User toUser(Usuario usuario);

    List<User> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compras",ignore = true),
            @Mapping(target = "direccions",ignore = true),
//            @Mapping(target = "rol",ignore = true),
    })
    Usuario toUsuario(User user);
}
