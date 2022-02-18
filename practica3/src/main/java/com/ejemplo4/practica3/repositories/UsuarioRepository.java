package com.ejemplo4.practica3.repositories;

import java.util.ArrayList;

import com.ejemplo4.practica3.models.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    public abstract ArrayList<Usuario> findByPrioridad(Integer prioridad);
}
