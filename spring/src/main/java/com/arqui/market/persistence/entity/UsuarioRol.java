//package com.arqui.market.persistence.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "usuario_rol")
//public class UsuarioRol {
//
//    @EmbeddedId
//    private UsuarioRolPK id;
//
//    @ManyToOne
//    @JoinColumn(name = "usuario_id",insertable = false,updatable = false)
//    private Usuario usuario;
//    @ManyToOne
//    @JoinColumn(name = "rol_id",insertable = false,updatable = false)
//    private Rol rol;
//
//    public UsuarioRolPK getId() {
//        return id;
//    }
//
//    public void setId(UsuarioRolPK id) {
//        this.id = id;
//    }
//
//
//}
