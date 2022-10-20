package com.springRest.RestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springRest.RestApi.models.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer>{

}
