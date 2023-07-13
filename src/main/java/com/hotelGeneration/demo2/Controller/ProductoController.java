package com.hotelGeneration.demo2.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotelGeneration.demo2.Entity.Producto;
import com.hotelGeneration.demo2.Service.ProductoService;

@RestController
@RequestMapping (path="/hotelGeneration/productos")

@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class ProductoController {
	
	//modificador acceso + constant+ nombreClase + nombreDelObjeto
	//public  final ClaseGatito Nenito
	public final ProductoService productoService;
	
	@Autowired
	
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}
	
	//Metodo get
	@GetMapping
	public List<Producto> getTodosLosProductos(){
		return productoService.leerTodosLosProductos();
	}
	
	//Metodo Get por ID
	@GetMapping (path="{prodID}")
	public Optional<Producto> getProducto(@PathVariable("prodID") Long id) {
		return productoService.leerProductoPorID(id);
	}
	
	//Metodo post
	@PostMapping
	public Producto postProducto(@RequestBody Producto producto) {
		return productoService.crearProducto(producto);
	}
	
	//Metodo put
	@PutMapping (path="{prodID}") //http://localhost:8080/hotelGeneration/productos/70
	public Producto updateProducto(@PathVariable("prodID") Long id,
			@RequestParam (required = false) String nombre,
			@RequestParam (required = false) String descripcion,
			@RequestParam (required = false) String imagen,
			@RequestParam (required = false) Double precio) {
		
		return productoService.actualizarProducto(id, nombre, descripcion, imagen, precio);	
	}
	
	//Metodo delete
	@DeleteMapping (path="{prodID}") //http://localhost:8080/hotelGeneration/productos/70
	public Producto deleteProducto(@PathVariable("prodID")Long id) {
		return productoService.borrarProducto(id);
	}

	
}
