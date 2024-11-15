package com.BaldovinoPFjava.tiendabike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.BaldovinoPFjava.tiendabike.model.App;
import com.BaldovinoPFjava.tiendabike.service.BicicletaService;


@SpringBootApplication
public class TiendabikeApplication implements CommandLineRunner {

    @Autowired
    private BicicletaService bicicletaService;  
    public static void main(String[] args) {
        SpringApplication.run(TiendabikeApplication.class, args);

        App app = new App();
        app.ejecutar();
    }

    @Override
    public void run(String... args) throws Exception {
        
        bicicletaService.agregarBicicletas();
    }
}






