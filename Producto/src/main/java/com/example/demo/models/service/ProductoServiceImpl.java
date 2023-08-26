package com.example.demo.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.entity.Producto;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductoServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Optional<Producto> findById(Integer id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Producto save(Producto p) {
		// TODO Auto-generated method stub
		return productRepository.save(p);
	}

	@Override
	public void deleteById(Integer id) {
		productRepository.deleteById(id);
		
	}

}
