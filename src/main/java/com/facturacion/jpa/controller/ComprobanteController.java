package com.facturacion.jpa.controller;

import com.facturacion.jpa.entity.Comprobante;
import com.facturacion.jpa.service.ComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/comprobantes")
public class ComprobanteController {

    @Autowired
    private ComprobanteService comprobanteService;

    @GetMapping
    public List<Comprobante> getAllComprobantes() {
        return comprobanteService.getAllComprobantes();
    }

    @PostMapping
    public Comprobante createComprobante(@RequestBody Comprobante comprobante) {
        return comprobanteService.saveComprobante(comprobante);
    }
}