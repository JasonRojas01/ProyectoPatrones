package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
    
    //Se declara un metodo para obetner un ArrayList de objetos productos
    //Los objetos vienen de una tabla producto
    //Son todos los registros o solo los activos
    public List<Producto> getProductos(boolean activos);
    
    //Abajo se colocaran los metodos para un CURD de productos... pero en semana 6...
    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
}
