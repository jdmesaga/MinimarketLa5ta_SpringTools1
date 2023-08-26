package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.entity.Producto;


@Repository
public interface ProductRepository extends JpaRepository<Producto, Integer>{

}
