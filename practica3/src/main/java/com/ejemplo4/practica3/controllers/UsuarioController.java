package com.ejemplo4.practica3.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.ejemplo4.practica3.models.Usuario;
import com.ejemplo4.practica3.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<Usuario>obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public Usuario guardaUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.guardaUsuario(usuario);
    }

    @GetMapping(path="/{id}")
    public Optional<Usuario>obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<Usuario> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping
    public String eliminarPorI(@PathVariable("id") Long id){
        boolean ok=this.usuarioService.eliminarUsuario(id);
        if(ok){
            return "se elimino el user con id: "+id;
        }else{
            return "no pudo eliminar el user con id: "+id;
        }
    }
}
