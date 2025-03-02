package com.facturacion.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "comprobante")
public class Comprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    @JsonIgnore
    private Usuario usuario;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private double total;

    @OneToMany(mappedBy = "comprobante", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<DetalleComprobante> detalles;
}