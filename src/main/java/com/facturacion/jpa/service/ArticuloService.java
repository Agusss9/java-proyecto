package com.facturacion.jpa.service;

import com.facturacion.jpa.entity.Articulo;
import com.facturacion.jpa.repository.ArticuloRepository;
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