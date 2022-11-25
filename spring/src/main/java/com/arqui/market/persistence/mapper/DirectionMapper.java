package com.arqui.market.persistence.mapper;

import com.arqui.market.domain.Direction;
import com.arqui.market.persistence.entity.Direccion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface DirectionMapper {
    @Mappings({
            @Mapping(source = "idDireccion",target = "directionId"),
            @Mapping(source = "direccion",target = "direction"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "latitud",target = "latitude"),
            @Mapping(source = "longitud",target = "longitude"),
            @Mapping(source = "estado",target = "active"),
            @Mapping(source = "idUsuario",target = "userId"),
            @Mapping(source = "usuario",target = "user"),
    })
    Direction toDirection(Direccion direccion);

    List<Direction> toDirections(List<Direccion> direccions);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra",ignore = true),
    })
    Direccion toDireccion(Direction direction);
}