package com.hotelGeneration.demo2.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.hotelGeneration.demo2.Entity.User;


@Repository
public interface UserRepository extends JpaRepository <User, Long>{
    
    //@Query("SELECT usuario FROM User WHERE usuario.nombre=?1")
    
    //Optional<User> encontrarPorEmail (String email);
    
    
}



//T tipo de Entidad - ID tipo de dato del ID

    //Clase Abstracta tiene metodos abstractos y metodos concretos
    //Interface solo tiene metodos abstractos
    
    //Contratos que metodos si o si se tienen que implementar (abstractos)
    

    /*JPQL (Java Persistence Query Language)
     * 
     * Es practicamente lo mismo que trabajar con SQL, solo que en lugar de trabajar con tablas y columnas, trabajamos con entidades y atributos (POJOS y los repositorios).
     * 
     */