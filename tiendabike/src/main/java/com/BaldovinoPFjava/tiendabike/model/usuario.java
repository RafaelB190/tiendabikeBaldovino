package com.BaldovinoPFjava.tiendabike.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
    

    
    @Entity
    public class usuario {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nombre;
        private String dni;
        private String direccion;
        private String email;
        private String tarjetaCredito;
    
        public Long getId() {
            return id;
        }
    
        public void setId(Long id) {
            this.id = id;
        }    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
            
        public String getDni() {
            return dni;
        }
        public void setDni(String dni) {
            this.dni = dni;
        }       
        public String getDireccion() {
            return direccion;
        }
    
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    
        
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        
        public String getTarjetaCredito() {
            return tarjetaCredito;
        }
    
        public void setTarjetaCredito(String tarjetaCredito) {
            this.tarjetaCredito = tarjetaCredito;
        }
    }
