package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    private String nombre_comun;
    private String descripcion;
    private int precio;
    private String rutaImagen;
    private boolean activo;

    public Producto() {
    }
}