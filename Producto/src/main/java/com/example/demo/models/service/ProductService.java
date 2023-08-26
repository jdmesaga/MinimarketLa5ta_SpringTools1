package com.example.demo.models.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.entity.Producto;

public interface ProductService {
	
	public Optional<Producto> findById(Integer id);
	public List<Producto> findAll();
	public Producto save(Producto p);
	public void deleteById(Integer id);

}
