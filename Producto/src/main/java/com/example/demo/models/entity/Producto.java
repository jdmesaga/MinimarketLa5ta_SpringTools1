package com.example.demo.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	
	@Id
	@Column(name = "id_pro")
	private int codigo;
	
	@Column(name = "nombre_pro")
	private String nombre;
	
	@Column(name = "cantidad_pro")
	private int cantidad;
	
	@Column(name = "precio_pro")
	private int precio;


	public Producto(int codigo, String nombre, int cantidad, int precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Producto() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	
	

}
	
