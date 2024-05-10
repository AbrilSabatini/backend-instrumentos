package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CategoriaInstrumento extends Base {

    @Column(nullable = false)
    private String denominacion;
}
