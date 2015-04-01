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
	
	public Person find(Long id) {
		return personRepository.findOne(id);
	}
	
	public Page<Person> findAll(int page, int count, Sort.Direction direction, String sortProperty) {
		return personRepository.findAll(new PageRequest(page, count, direction, sortProperty));
	}
	
	public void save(Person person) {
		personRepository.save(person);
	}
	
	public void delete(Long id) {
		personRepository.delete(id);
	}

}
