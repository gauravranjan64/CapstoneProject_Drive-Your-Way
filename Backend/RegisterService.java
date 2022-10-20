package com.springRest.RestApi.sources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.RestApi.Repository.RegisterRepository;
import com.springRest.RestApi.models.Register;

@Service
public class RegisterService {
	@Autowired
	private RegisterRepository registerRepo;

	public Register addNewCustomer(Register register) {
		return registerRepo.save(register);
	}

	public List<Register> getAllCustomers() {
		return registerRepo.findAll();
	}

	public Register updateCustomer(Register reg) {
		return registerRepo.save(reg);
	}

	public void deleteAllCustomer() {
		registerRepo.deleteAll();
		
	}

}
