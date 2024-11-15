package com.BaldovinoPFjava.tiendabike.model;

public class bh extends Bicicleta {
    public bh (long id,String modelo, String marca, double precio) {
        super(id, modelo, marca, precio );
    }    

    public static bh[] getModelos() {
        return new bh[] {
            new bh(1L, "Ultimate", "Mountain Bike", 1800.0),
            new bh(2L, "Quartz", "Ruta", 1450.0),
            new bh(3L, "Sphene", "Urbana", 1100.0),
            new bh(4L, "Zaphire", "Mountain Bike", 1300.0),
            new bh(5L, "Aerolite", "Ruta", 1900.0)
        };
    }
    
}