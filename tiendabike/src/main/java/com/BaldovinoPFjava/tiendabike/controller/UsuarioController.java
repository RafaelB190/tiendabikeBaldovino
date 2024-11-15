package com.BaldovinoPFjava.tiendabike.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BaldovinoPFjava.tiendabike.model.usuario;
import com.BaldovinoPFjava.tiendabike.service.JsonPlaceholderService;
import com.BaldovinoPFjava.tiendabike.service.usuarioService;  

@RestController
@RequestMapping("/usuarios")  
public class UsuarioController {

    private final usuarioService usuarioService;  
    private final JsonPlaceholderService jsonPlaceholderService;  
    
   
    public UsuarioController(usuarioService usuarioService, JsonPlaceholderService jsonPlaceholderService) {
        this.usuarioService = usuarioService;
        this.jsonPlaceholderService = jsonPlaceholderService;
    }

   
    @GetMapping
    public List<usuario> obtenerTodosLosUsuarios() {
        return usuarioService.getAllUsuarios();  
    }

    
    @GetMapping("/{id}")
    public usuario obtenerUsuarioPorId(@PathVariable Long id) {
        return usuarioService.getUsuarioById(id).orElse(null);  
    }

    
    @PostMapping
    public usuario crearUsuario(@RequestBody usuario usuario) {
        return usuarioService.saveUsuario(usuario); 
    }

    
    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);  
    }

   
    @GetMapping("/externos")
    public String obtenerTodosLosUsuariosExternos() {
        return jsonPlaceholderService.obtenerTodosLosUsuarios();
    }

    
    @GetMapping("/externos/{id}")
    public String obtenerUsuarioExternoPorId(@PathVariable Long id) {
        return jsonPlaceholderService.obtenerUsuarioPorId(id);
    }
}
