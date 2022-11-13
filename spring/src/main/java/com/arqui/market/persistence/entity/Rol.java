package com.arqui.market.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;
    private String nombre;

    public Integer getIdRol() {
        return idRol;
    }

    @OneToMany(mappedBy = "usuario")
    private List<UsuarioRol> usuario;
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
