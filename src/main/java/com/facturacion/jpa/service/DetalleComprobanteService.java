package com.facturacion.jpa.service;

import com.facturacion.jpa.entity.DetalleComprobante;
import com.facturacion.jpa.repository.DetalleComprobanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleComprobanteService {

    @Autowired
    private DetalleComprobanteRepository detalleComprobanteRepository;

    public List<DetalleComprobante> getAllDetallesComprobantes() {
        return detalleComprobanteRepository.findAll();
    }

    public DetalleComprobante saveDetalleComprobante(DetalleComprobante detalleComprobante) {
        return detalleComprobanteRepository.save(detalleComprobante);
    }
}