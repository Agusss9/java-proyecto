package com.facturacion.jpa.controller;

import com.facturacion.jpa.entity.DetalleComprobante;
import com.facturacion.jpa.service.DetalleComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/detalles-comprobantes")
public class DetalleComprobanteController {

    @Autowired
    private DetalleComprobanteService detalleComprobanteService;

    @GetMapping
    public List<DetalleComprobante> getAllDetallesComprobantes() {
        return detalleComprobanteService.getAllDetallesComprobantes();
    }

    @PostMapping
    public DetalleComprobante createDetalleComprobante(@RequestBody DetalleComprobante detalleComprobante) {
        return detalleComprobanteService.saveDetalleComprobante(detalleComprobante);
    }
}