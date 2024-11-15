package com.BaldovinoPFjava.tiendabike.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BaldovinoPFjava.tiendabike.model.Bicicleta;
import com.BaldovinoPFjava.tiendabike.model.bh;
import com.BaldovinoPFjava.tiendabike.model.santaCruz;
import com.BaldovinoPFjava.tiendabike.model.slp;
import com.BaldovinoPFjava.tiendabike.model.vairo;
import com.BaldovinoPFjava.tiendabike.model.venzo;
import com.BaldovinoPFjava.tiendabike.repository.BicicletaRepository;

@Service
public class BicicletaService {

    @Autowired
    private BicicletaRepository bicicletaRepository;

    public void agregarBicicletas() {
        Bicicleta bici1 = new venzo(1L, "Venzo", "Modelo1", 5000.0); 
        Bicicleta bici2 = new slp(2L,"slp", "Modelo2", 600.0);
        Bicicleta bici3 = new vairo(3L,"vairo", "Modelo3", 700.0);
        Bicicleta bici4 = new santaCruz(4L,"santaCRuz", "Modelo4", 800.0);
        Bicicleta bici5 = new bh(5L,"bh", "Modelo5", 900.0);
        
        
        bicicletaRepository.save(bici1);
        bicicletaRepository.save(bici2);
        bicicletaRepository.save(bici3);
        bicicletaRepository.save(bici4);
        bicicletaRepository.save(bici5);
    }
}
