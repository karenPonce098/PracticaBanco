package com.ejemplo4.practica3.services;

import java.util.ArrayList;
import java.util.Optional;

import com.ejemplo4.practica3.models.Usuario;
import com.ejemplo4.practica3.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRepositoriesAutoConfiguration;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario>obtenerUsuarios(){
        return (ArrayList <Usuario>) usuarioRepository.findAll();
    }

    public Usuario guardaUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario>obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }

    public ArrayList<Usuario>obtenerPorPrioridad(Integer prioridad){
        return usuarioRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
