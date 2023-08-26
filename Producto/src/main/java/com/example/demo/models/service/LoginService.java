package com.example.demo.models.service;

import com.example.demo.models.entity.Login;

public interface LoginService {

	public Login save(Login l);
	public String login(String user, String ctr);

}
