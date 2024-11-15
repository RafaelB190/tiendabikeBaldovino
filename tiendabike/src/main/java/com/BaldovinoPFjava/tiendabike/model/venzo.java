package com.BaldovinoPFjava.tiendabike.model;

public class venzo extends Bicicleta {
    public venzo(Long id, String modelo, String marca, double precio) {
        super(id, modelo, marca, precio);
    }

    public static venzo[] getModelos() {
        return new venzo[] {
            new venzo(1L, "X-20", "Mountain Bike", 1200.0),
            new venzo(2L, "X-Blade", "Mountain Bike", 1100.0),
            new venzo(3L, "Raptor", "Mountain Bike", 1300.0),
            new venzo(4L, "Pro Race", "Ruta", 1500.0),
            new venzo(5L, "Nitro", "Urbana", 1400.0)
        };
    }
}
