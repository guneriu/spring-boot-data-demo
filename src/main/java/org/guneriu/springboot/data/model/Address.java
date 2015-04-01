package org.guneriu.springboot.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	private Integer houseNumber;
	private String street;
	private String city;
	
	public Integer getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNumber=" + houseNumber
				+ ", street=" + street + ", city=" + city + "]";
	}
	
	
}
