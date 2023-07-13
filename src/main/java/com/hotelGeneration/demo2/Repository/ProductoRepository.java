package com.hotelGeneration.demo2.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelGeneration.demo2.Entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
	
	Optional<Producto> findByNombre(String nombre);

}
