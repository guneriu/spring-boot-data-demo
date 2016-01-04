package org.guneriu.springboot.data.service;

import org.guneriu.springboot.data.model.Person;
import org.guneriu.springboot.data.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Person find(Long personId) {
		return personRepository.findOne(personId);
	}
	
	public Page<Person> findAll(int page, int count, Sort.Direction direction, String sortProperty) {
		return personRepository.findAll(new PageRequest(page, count, direction, sortProperty));
	}
	
	public Person save(Person person) {
		return personRepository.save(person);
	}
	
	public void delete(Long personId) {
		personRepository.delete(personId);
	}

}
