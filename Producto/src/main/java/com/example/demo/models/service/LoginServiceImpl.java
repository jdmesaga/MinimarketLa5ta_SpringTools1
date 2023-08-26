package com.example.demo.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.entity.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public Login save(Login l) {
		
		return loginRepository.save(l);
	}

	
	@Override
	public String login(String user, String ctr) {
		
		Login login = loginRepository.findByUsername(user);
		

        if (login == null) {
            return "Usuario no encontrado";
        }

        if (!login.getPassword().equals(ctr)) {
            return "Contraseña incorrecta";
        }

        return "Inicio de sesión exitoso";
	}
}
