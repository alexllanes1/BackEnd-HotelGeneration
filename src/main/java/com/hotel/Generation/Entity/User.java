package com.hotel.Generation.Entity;

public class User {
	/*
	 * Se usa el atributo static para el id, ya que sera convertido en una variable de la insrancia y le pretenece a la clase y no al objeto. Nos ayida a tened un mejor control del contador y que independientemente de la instancia este valor siempre lo otrogra la clase asi evitamos id repetidos o saltados
	 * */
	
	//Propriedades
	private static Long id = 0L;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;

	//Constructor

	/*
	 * Utilizamos un contador id++ dentro del constructo para poder emular el atributo autoincrementable de nuestra columna id de la BD. cuando conectemos la bd ya no necesitaremos este dato
	 * */
	
	public User(String nombre, String apellido, String email, String telefono) {
		id++; //Contador para emular el autoincrementable
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}

	public Long getId() {
		return id;
	}

	/*
	 * Se quita el setter porque no se modifica
	 * */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
	///getter y setter
	
	

}
