package com.springRest.RestApi.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="car_details")
public class CarDetails {

	private String carName;
	private String model;
	private String color;
	private int year;
	private String engine;
	private String brand;
	private String ownerName;
	@Id
	private int ownerContact;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "CarDetails [carName=" + carName + ", model=" + model + ", color=" + color + ", year=" + year
				+ ", engine=" + engine + ", brand=" + brand + ", ownerName=" + ownerName + ", ownerContact="
				+ ownerContact + "]";
	}
	public CarDetails(String carName, String model, String color, int year, String engine, String brand,
			String ownerName, int ownerContact) {
		super();
		this.carName = carName;
		this.model = model;
		this.color = color;
		this.year = year;
		this.engine = engine;
		this.brand = brand;
		this.ownerName = ownerName;
		this.ownerContact = ownerContact;
	}
	public CarDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getOwnerContact() {
		return ownerContact;
	}
	public void setOwnerContact(int ownerContact) {
		this.ownerContact = ownerContact;
	}
	

}
