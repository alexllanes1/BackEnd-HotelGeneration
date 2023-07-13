package com.hotelGeneration.demo2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelGeneration.demo2.Entity.Producto;
import com.hotelGeneration.demo2.Repository.ProductoRepository;

@Service
public class ProductoService {
	
	public final ProductoRepository productoRepository;
	
	@Autowired 

	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	//Metodos del CRUD CREATE READ UPDATE DELETE
	
	//leer los productos
	public List<Producto> leerTodosLosProductos(){
		return productoRepository.findAll();
	}
	
	//Metodo para leer un producto por su id
	public Optional<Producto> leerProductoPorID(Long id) {
		return productoRepository.findById(id);
	}
	
	//Crear nuevos productos
	public Producto crearProducto(Producto producto) {
		Producto prodTemporal = null;
		//Si no existe se crea
		if(productoRepository.findByNombre(producto.getNombre()).isEmpty()) {
			prodTemporal = productoRepository.save(producto);
		}else {
			//Si existe se imprime un mensaje
			System.out.println("Ya existe un producto con el nombre ingresado");
		}
		return prodTemporal;
	}
	
	//Metodo para modificar producto
	public Producto actualizarProducto(Long id, String nombre, String descripcion, String imagen, Double precio) {
		Producto prodTemporal = null;
		//Si existe lo modifico
		if(productoRepository.existsById(id)) {
			prodTemporal = productoRepository.findById(id).get();
			if(nombre!=null) prodTemporal.setNombre(nombre);
			if(descripcion!=null) prodTemporal.setDescripcion(descripcion);
			if(imagen!=null) prodTemporal.setImagen(imagen);
			if(precio!=null) prodTemporal.setPrecio(precio);
			productoRepository.save(prodTemporal);

		}else {		//Si no existe se manda un mensaje
			System.out.println("El producto que quieres actualizar no existe");
		}
		return prodTemporal;
	}
	
	//Metodo para borrar un producto
	public Producto borrarProducto(Long id) {
		Producto prodTemporal = null;
		
		if(productoRepository.existsById(id)) {
			prodTemporal = productoRepository.findById(id).get();
			productoRepository.deleteById(id);
		}
		return prodTemporal;
	}
	

}
