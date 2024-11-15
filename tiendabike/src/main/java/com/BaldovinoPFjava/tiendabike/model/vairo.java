package com.BaldovinoPFjava.tiendabike.model;

public class vairo extends Bicicleta {
    public vairo(Long id, String modelo, String marca, double precio) {
        super(id, modelo, marca, precio);
    }

    public static vairo[] getModelos() {
        return new vairo[] {
            new vairo(1L, "Vairo X", "Mountain Bike", 1250.0),
            new vairo(2L, "XR Pro", "Ruta", 1400.0),
            new vairo(3L, "Speed", "Urbana", 1100.0),
            new vairo(4L, "Cross", "Mountain Bike", 1300.0),
            new vairo(5L, "Advance", "Ruta", 1500.0)
        };
    }
}
