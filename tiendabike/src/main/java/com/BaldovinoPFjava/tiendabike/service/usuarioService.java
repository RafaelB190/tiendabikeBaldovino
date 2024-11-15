package com.BaldovinoPFjava.tiendabike.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.BaldovinoPFjava.tiendabike.model.usuario;
import com.BaldovinoPFjava.tiendabike.repository.usuarioRepository;

@Service
public class usuarioService {

    private final usuarioRepository usuarioRepository;

    
    public usuarioService(usuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<usuario> getUsuarioById(Long id) {
        return usuarioRepository.findById(id);
    }

    public usuario saveUsuario(usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
