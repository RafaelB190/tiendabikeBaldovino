package com.BaldovinoPFjava.tiendabike.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class App {

    public void ejecutar() {
        List<Bicicleta> bicicletas = new ArrayList<>();

        
        agregarBicicletas(bicicletas, venzo.getModelos());
        agregarBicicletas(bicicletas, slp.getModelos());
        agregarBicicletas(bicicletas, vairo.getModelos());
        agregarBicicletas(bicicletas, bh.getModelos());
        agregarBicicletas(bicicletas, santaCruz.getModelos());

        
        for (Bicicleta bici : bicicletas) {
            bici.mostrarInfo();
            System.out.println("------------");
        }
    }

    
    private static void agregarBicicletas(List<Bicicleta> bicicletas, Bicicleta[] modelos) {
        Collections.addAll(bicicletas, modelos);
    }
}
