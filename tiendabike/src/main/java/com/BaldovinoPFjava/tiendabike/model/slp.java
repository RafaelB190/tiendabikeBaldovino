package com.BaldovinoPFjava.tiendabike.model;

public class slp extends Bicicleta {
    public slp(long id, String modelo, String marca, double precio) {
        super(id, modelo, marca, precio);
    }

    public static slp[] getModelos() {
        return new slp[] {
            new slp(1L, "SLP-Trail", "Mountain Bike", 1600.0),
            new slp(2L, "SLP-City", "Urbana", 900.0),
            new slp(3L, "SLP-Ride", "Ruta", 1100.0),
            new slp(4L, "SLP-Speed", "Ruta", 1350.0),
            new slp(5L, "SLP-Pro", "Mountain Bike", 1550.0)
        };
    }
}
