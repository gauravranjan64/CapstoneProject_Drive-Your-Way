package com.springRest.RestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springRest.RestApi.models.CarDetails;

@Repository
public interface CarDetailsRepository extends JpaRepository<CarDetails, Integer>{

}
