package com.hotelGeneration.demo2.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	//Atributos
	
	@Column (name = "id", unique = true, nullable = false)
	private Long id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private double precio;
	
	//@ManyToOne(name="User")

	
	//constructor
	public Producto(Long id, String nombre, String descripcion, String imagen, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
	}
	
	//contructor vacio
	public Producto(){
		
	}
	
	//Getter y setter

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//toString
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + "]";
	}	
	
	
	
	

}
