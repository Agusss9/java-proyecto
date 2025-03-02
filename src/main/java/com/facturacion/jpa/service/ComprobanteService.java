package com.facturacion.jpa.service;

import com.facturacion.jpa.entity.Comprobante;
import com.facturacion.jpa.repository.ComprobanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobanteService {

    @Autowired
    private ComprobanteRepository comprobanteRepository;

    public List<Comprobante> getAllComprobantes() {
        return comprobanteRepository.findAll();
    }

    public Comprobante saveComprobante(Comprobante comprobante) {
        return comprobanteRepository.save(comprobante);
    }
}