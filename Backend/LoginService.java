package com.springRest.RestApi.sources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.RestApi.Repository.LoginRepository;
import com.springRest.RestApi.models.Login;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepo;
	
	public List<Login> getAllUsers(){
		return loginRepo.findAll();
	}
}
