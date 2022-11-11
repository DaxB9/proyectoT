package com.arqui.market.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "usuario_id")
    private String idUsuario;
    private Timestamp fecha;
    @Column(name = "medio_pago")
    private String medioPago;
    private String comentario;
    private Integer estado;
    @Column(name = "direccion_id")
    private Integer idDireccion;

//    @ManyToOne
//    @JoinColumn(name = "usuario_id",insertable = false,updatable = false)
//    private Usuario usuario;

    @OneToMany(mappedBy = "producto")
    private List<CompraProducto> productos;

    @OneToOne
    @JoinColumn(name = "direccion_id",insertable = false,updatable = false)
    private Direccion direccion;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }
}
