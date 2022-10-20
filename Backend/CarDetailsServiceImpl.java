package com.springRest.RestApi.sources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.RestApi.Repository.CarDetailsRepository;
import com.springRest.RestApi.models.CarDetails;

@Service
public class CarDetailsServiceImpl {
	
	@Autowired
	private CarDetailsRepository carDetailsRepo;
	
	
	public List<CarDetails> getCarDetails() {
		// TODO Auto-generated method stub
		return carDetailsRepo.findAll();
	}
	
	public CarDetails addCarDetails(CarDetails cd) {
		return carDetailsRepo.save(cd);
	}
	
	public void deleteCarDetails() {
		carDetailsRepo.deleteAll();
	}
	
	public Optional<CarDetails> getSpecificCarDetails(int ownerContact){
		return carDetailsRepo.findById(ownerContact);
	}

	public CarDetails updateCarDetails(CarDetails car) {
		return carDetailsRepo.save(car);
	}

}
