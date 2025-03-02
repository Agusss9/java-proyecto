package com.facturacion.jpa.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(name = "nombre", nullable = false)
    @JsonProperty("nombre")
    private String nombre;

    @Column(name = "email", unique = true, nullable = false)
    @JsonProperty("email")
    private String email;
}