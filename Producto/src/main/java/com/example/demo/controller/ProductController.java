package com.example.demo.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.Producto;
import com.example.demo.models.service.ProductService;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/{id}")
	public Optional<Producto> buscarById(@PathVariable Integer id){
		return productService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Producto> listAll(){
		
		return productService.findAll();
	}
	
	@PostMapping
	public Producto guardar(@RequestBody Producto p){
		
		return productService.save(p);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id){
		productService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public void update(@RequestBody Producto p, @PathVariable Integer id){
		Producto eEnDB=productService.findById(id).get();
			
		eEnDB.setNombre(p.getNombre());
		eEnDB.setPrecio(p.getPrecio());
		eEnDB.setCantidad(p.getCantidad());
		
		productService.save(eEnDB);
		
	}

}
