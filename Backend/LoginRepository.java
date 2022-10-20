package com.springRest.RestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springRest.RestApi.models.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

}
