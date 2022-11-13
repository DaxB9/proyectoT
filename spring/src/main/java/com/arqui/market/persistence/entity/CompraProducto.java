package com.arqui.market.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "compra_producto")
public class CompraProducto {
    @EmbeddedId
    private CompraProductoPK id;
    private Integer cantidad;
    private BigDecimal total;
    private Integer estado;

    @ManyToOne
    @MapsId("idCompra")
    @JoinColumn(name = "compra_id",insertable = false,updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "producto_id",insertable = false,updatable = false)
    private Producto producto;

    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
