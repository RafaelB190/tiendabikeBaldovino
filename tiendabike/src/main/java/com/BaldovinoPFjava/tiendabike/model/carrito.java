package com.BaldovinoPFjava.tiendabike.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private usuario usuario;

    @ManyToMany
    private List<Bicicleta> bicicletas = new ArrayList<>();

   
    public carrito() {}

    
    public carrito(usuario usuario) {
        this.usuario = usuario;
    }

    
    public void agregarBicicleta(Bicicleta bicicleta) {
        this.bicicletas.add(bicicleta);
    }

    public void eliminarBicicleta(Bicicleta bicicleta) {
        this.bicicletas.remove(bicicleta);
    }

    
}
