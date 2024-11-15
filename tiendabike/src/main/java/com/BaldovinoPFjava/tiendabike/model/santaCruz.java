package com.BaldovinoPFjava.tiendabike.model;

public class santaCruz extends Bicicleta {
    public santaCruz(long id, String modelo, String marca, double precio) {
        super(id, modelo, marca, precio);
    }

    public static santaCruz[] getModelos() {
        return new santaCruz[] {
            new santaCruz(1L, "Bronson", "Mountain Bike", 2100.0),
            new santaCruz(2L, "Chameleon", "Mountain Bike", 2000.0),
            new santaCruz(3L, "Blur", "Ruta", 2200.0),
            new santaCruz(4L, "Jackal", "Mountain Bike", 1950.0),
            new santaCruz(5L, "Nomad", "Mountain Bike", 2500.0)
        };
    }
}
