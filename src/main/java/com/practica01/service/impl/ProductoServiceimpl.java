package com.practica01.service.impl;

import com.practica01.dao.ProductoDao;
import com.practica01.domain.Producto;
import com.practica01.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceimpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductoes(boolean activos) {
        List<Producto> lista = productoDao.findAll();

        if (activos) {
            //Para remover las categorias donde activo sea igual a falso
            lista.removeIf(x -> !x.isActivo());
        }
        return lista;

    }
    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

 

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

 

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
}
