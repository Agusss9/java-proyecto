package com.facturacion.app.repository;

import com.facturacion.app.entity.DetalleComprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleComprobanteRepository extends JpaRepository<DetalleComprobante, Long> {
}