package com.facturacion.app.service;

import com.facturacion.app.entity.Comprobante;
import com.facturacion.app.repository.ComprobanteRepository;
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