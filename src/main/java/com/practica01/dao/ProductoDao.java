package com.practica01.dao;

import com.practica01.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoDao extends  JpaRepository<Producto, Long>{
    //Mas adelante vamos a tener metodos ampliados

}