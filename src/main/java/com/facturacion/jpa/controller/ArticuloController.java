package com.facturacion.jpa.controller;

import com.facturacion.jpa.entity.Articulo;
import com.facturacion.jpa.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @GetMapping
    public List<Articulo> getAllArticulos() {
        return articuloService.getAllArticulos();
    }

    @PostMapping
    public Articulo createArticulo(@RequestBody Articulo articulo) {
        return articuloService.saveArticulo(articulo);
    }
}