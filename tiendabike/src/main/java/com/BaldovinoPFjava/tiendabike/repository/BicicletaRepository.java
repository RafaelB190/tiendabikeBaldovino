package com.BaldovinoPFjava.tiendabike.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BaldovinoPFjava.tiendabike.model.Bicicleta;

@Repository
public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {
    List <Bicicleta> findBicicletasConPrecioMayorA(Double precio);
}

