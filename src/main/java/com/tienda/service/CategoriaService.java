package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    
    //Se declara un metodo para obtener un ArrayList de Objetos Categoria
    //Los objetos vienen de la tabla categoria...
    //Son todos los Registros o solo activos.
    public List<Categoria> getCategorias(boolean activos);
    
    //Abajo se colocaran los metodos para un CRUD de categorias... Pero en semana 6...
    
}
