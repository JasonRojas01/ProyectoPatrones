package com.practica01.service;

import com.practica01.domain.Producto;
import java.util.List;


public interface ProductoService {
    //Metodo que retorna la lista de productoes 

    public List<Producto> getProductoes(boolean activos);
    

// Se obtiene un Categoria, a partir del id de un categoria

    public Producto getProducto(Producto producto);

 

    // Se inserta un nuevo categoria si el id del categoria esta vacío

    // Se actualiza un categoria si el id del categoria NO esta vacío

    public void save(Producto producto);

 

    // Se elimina el categoria que tiene el id pasado por parámetro

    public void delete(Producto producto);
}
