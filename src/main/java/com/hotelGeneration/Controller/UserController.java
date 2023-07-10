package com.hotelGeneration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.Generation.Entity.User;
import com.hotelGeneration.Service.UserService;

/*
 *El controller es quien lleva todo el peso referente a las colicitudes HTTP. Aqui sucede la manipulacion de los metodos HTTP (GET, POST, PUT, DELETE)
 *
 *Para poder decirle a JAVA que esta clase es un controller necesitamos poner una anotacion @RestController. Esto nos ayudara a poder manejar las solicitudes HTTP y ademas manejamos el fetch que hay en el front
 * */

@RequestMapping(path="/hotelGeneration/users")
@RestController
public class UserController {
	
	//Instancia de la clase UserService
	
	private final UserService userService;
	
	@Autowired
	
	//
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	/*
	 * ya que mi controller depende de mi servicio con la instancia de UserService dentro de UserController podre establecer los metodos HTTP que disparan el crud
	 * 
	 * */
	
	//Metodos HTTP
	@GetMapping
	public List <User> getUsuarios(){
		return userService.readUsuarios();
	}
}
