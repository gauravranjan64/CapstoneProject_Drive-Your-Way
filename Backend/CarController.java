package com.springRest.RestApi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.RestApi.models.CarDetails;
import com.springRest.RestApi.models.Login;
import com.springRest.RestApi.models.Register;
import com.springRest.RestApi.sources.CarDetailsServiceImpl;
import com.springRest.RestApi.sources.LoginService;
import com.springRest.RestApi.sources.RegisterService;

@RestController
public class CarController {
	@Autowired
	CarDetailsServiceImpl carDetails;
	
	@Autowired
	RegisterService registerService;
	
	@Autowired
	LoginService loginService;
		
	//http://localhost:8080/carDetails
	@GetMapping("/carDetails")	
	public List<CarDetails> getCarDetails(){
		return carDetails.getCarDetails();	
	}
	
	//http://localhost:8080/addCarDetails
	@PostMapping("/addCarDetails")
	public CarDetails addDetails(@RequestBody CarDetails cd) {
		return carDetails.addCarDetails(cd);
	} 
	
	//http://localhost:8080/deleteAllDetails
	@DeleteMapping("/deleteAllDetails")
	public void deleteDetails() {
		carDetails.deleteCarDetails();
	}
	
	
	//http://localhost:8080/getSpecificDetail/{}
	@GetMapping("/getSpecificDetail/{ownerContact}")
	public Optional<CarDetails> getSpecificDetail(@PathVariable int ownerContact){
		return carDetails.getSpecificCarDetails(ownerContact);
	}
	
	//http://localhost:8080/updatDetails
	@PutMapping("/updatDetails")
	public CarDetails updateDetails(@RequestBody CarDetails car) {
		return carDetails.updateCarDetails(car);
	}
	//=================Regsiter==============
	
	//http://localhost:8080/addCustomer
	@PostMapping("/addCustomer")
	public Register addCustomer(@RequestBody Register register) {
		return registerService.addNewCustomer(register);
	}
	//http://localhost:8080/getAllCustomer
	@GetMapping("/getAllCustomer")
	public List<Register> getCustomers(){
		return registerService.getAllCustomers();
	}
	
	//http://localhost:8080/updateCustomer
	@PutMapping("/updateCustomer")
	public Register updateCustomers(@RequestBody Register reg) {
		return registerService.updateCustomer(reg);
	}
	
	//http://localhost:8080/deleteAllCustomer
	@DeleteMapping("/deleteAllCustomer")
	public void deleteCustomer() {
		registerService.deleteAllCustomer();
	}
	
	
	//===============Login===================
	//http://localhost:8080/getAllUser
	@GetMapping("/getAllUser")
	public List<Login> getUser(){
		return loginService.getAllUsers();
	}


}
