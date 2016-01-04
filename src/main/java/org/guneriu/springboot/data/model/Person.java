package org.guneriu.springboot.data.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.hateoas.ResourceSupport;

@Entity
public class Person extends ResourceSupport {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long personId;
	private String name;
	private Integer age;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age="
				+ age + ", address=" + address + "]";
	}

}
