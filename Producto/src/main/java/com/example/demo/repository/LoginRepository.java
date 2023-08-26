package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long>{
	
	Login findByUsername(String user);

}
