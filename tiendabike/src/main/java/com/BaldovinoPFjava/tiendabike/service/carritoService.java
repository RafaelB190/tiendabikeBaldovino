package com.BaldovinoPFjava.tiendabike.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BaldovinoPFjava.tiendabike.model.Bicicleta;
import com.BaldovinoPFjava.tiendabike.model.carrito;
import com.BaldovinoPFjava.tiendabike.repository.carritoRepository;

@Service
public class carritoService {

    @Autowired
    private carritoRepository carritoRepository;

    public carrito crearCarrito(carrito carrito) {
        return carritoRepository.save(carrito);
    }

    public void agregarBicicletaACarrito(Long carritoId, Bicicleta bicicleta) {
        Optional<carrito> carritoOpt = carritoRepository.findById(carritoId);
        if (carritoOpt.isPresent()) {
            carrito carrito = carritoOpt.get();
            carrito.agregarBicicleta(bicicleta);
            carritoRepository.save(carrito);
        }
    }
}
