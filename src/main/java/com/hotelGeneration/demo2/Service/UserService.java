package com.hotelGeneration.demo2.Service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hotelGeneration.demo2.Entity.User;
import com.hotelGeneration.demo2.Repository.UserRepository;

/*
 * Recuerda que la paca de servicios, se encarga de definir la  logica de negocio del lado de Java(aqui es donde vamos a definir los metodos enfocados) a las operaciones del CRUD que seran "disparados" por los metodos HTTP QUE SE ENCONTRARÁN EN EL CONTROLADOR*/

//Anotaciones que son instrucciones que le damos a JAVA para que sepa algo (@Test, @Override)

@Service
public class UserService {
	
	//Autowired
	private final UserRepository userRepository;
	
	//anotacion
	@Autowired
	
	//Constructor
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	//Metodo para leer todos los usuarios de la bd
	
	public List<User> leerUsarios(){
		return userRepository.findAll();
	}
	
	
	//Metodo para agregar usuarios
	
	//Metodo para borrar usuarios

	//Metodo para modificar usuarios

	//Metodo para leer usuarios


}

/*
 * 
 * 	//Metodo para emular una base de datos
	public List<User> listaDeUsuarios = new ArrayList<User>();
	
	//Metodo Crud
	
	//Metodo para traer a todos los usuarios
	public List<User> readUsuarios(){
		return listaDeUsuarios;
	}
	
 
 	//Instancia de las personas
	public UserService() {
	listaDeUsuarios.add(new User("Felipe", "Maqueda", "felipe@mail.com", "5512345678"));
	listaDeUsuarios.add(new User("Mariana", "Valladolid", "Mariana@mail.com", "5551231234"));
	listaDeUsuarios.add(new User("Naruto", "Uzumaki", "naruto@mail.com", "1818123456"));

	}
 * 
 * */
