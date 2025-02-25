package com.facturacion.app.service;

import com.facturacion.app.entity.Articulo;
import com.facturacion.app.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloService {

    @Autowired
    private ArticuloRepository articuloRepository;

    public List<Articulo> getAllArticulos() {
        return articuloRepository.findAll();
    }

    public Articulo saveArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }
}