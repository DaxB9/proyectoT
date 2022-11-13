package com.arqui.market.persistence.mapper;

import com.arqui.market.domain.Purchase;
import com.arqui.market.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {


    @Mappings({
            @Mapping(source = "idCompra", target = "purchaseId"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "medioPago", target = "paymentMethod"),
            @Mapping(source = "comentario", target = "comment"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "idDireccion", target = "direccionId"),
            @Mapping(source = "productos", target = "items")
    })
    Purchase toPurchase(Compra compra);

    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mapping(target = "usuario", ignore = true)
    Compra toCompra(Purchase purchase);
}
