package com.arqui.market.persistence.mapper;

import com.arqui.market.domain.PurchaseItem;
import com.arqui.market.persistence.entity.CompraProducto;
import org.mapstruct.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {
    @Mappings({
            @Mapping(source = "id.idProducto",target = "productId"),
            @Mapping(source = "cantidad", target = "quantity"),
            //@Mapping(source = "total", target = "total"), No es necesario ya que tienen el mismo nombre
            @Mapping(source = "estado", target =  "active")
    })
    PurchaseItem toPurchaseItem(CompraProducto producto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "producto", ignore = true),
            @Mapping(target = "id.idCompra", ignore = true),
    })
    CompraProducto toPurchaseItem(PurchaseItem item);
}
