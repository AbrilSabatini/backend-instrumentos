package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Instrumento extends Base {

    @Column(nullable = false)
    private String instrumento;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private String imagen;

    @Column(nullable = false)
    private double precio;

    @Column(nullable = false)
    private String costoEnvio;

    @Column(nullable = false)
    private int cantidadVendida;

    @Column(nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaInstrumento idCategoria;
}
