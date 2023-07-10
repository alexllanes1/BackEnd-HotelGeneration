package com.hotelGeneration.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.Generation.Entity.User;

/*
 * Recuerda que la paca de servicios, se encarga de definir la  logica de negocio del lado de Java(aqui es donde vamos a definir los metodos enfocados) a las operaciones del CRUD que seran "disparados" por los metodos HTTP QUE SE ENCONTRARÁN EN EL CONTROLADOR*/

//Anotaciones que son instrucciones que le damos a JAVA para que sepa algo (@Test, @Override)

@Service
public class UserService {
	
	//Metodo para emular una base de datos
	public List<User> listaDeUsuarios = new ArrayList<User>();
	
	//Instancia de las personas
	public UserService() {
	listaDeUsuarios.add(new User("Felipe", "Maqueda", "felipe@mail.com", "5512345678"));
	listaDeUsuarios.add(new User("Mariana", "Valladolid", "Mariana@mail.com", "5551231234"));
	listaDeUsuarios.add(new User("Naruto", "Uzumaki", "naruto@mail.com", "1818123456"));

	}
	
	//Metodo Crud
	
	//Metodo para traer a todos los usuarios
	public List<User> readUsuarios(){
		return listaDeUsuarios;
	}
	
	
	//Metodo para agregar usuarios
	
	//Metodo para borrar usuarios

	//Metodo para modificar usuarios

	//Metodo para leer usuarios


}
