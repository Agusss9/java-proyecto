package com.facturacion.jpa.repository;

import com.facturacion.jpa.entity.DetalleComprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleComprobanteRepository extends JpaRepository<DetalleComprobante, Long> {
}