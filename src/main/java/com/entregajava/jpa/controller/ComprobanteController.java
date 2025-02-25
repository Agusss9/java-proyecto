package com.facturacion.app.controller;

import com.facturacion.app.entity.Comprobante;
import com.facturacion.app.service.ComprobanteService;
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