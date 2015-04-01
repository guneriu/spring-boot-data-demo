package org.guneriu.springboot.data.controller;

import org.guneriu.springboot.data.model.Person;
import org.guneriu.springboot.data.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class TestController {

	@Autowired
	PersonService personService;

	@RequestMapping(method = RequestMethod.GET)
	public Page<Person> findAll(
			@RequestParam(value = "page", defaultValue = "0", required = false) int page,
			@RequestParam(value = "count", defaultValue = "10", required = false) int count,
			@RequestParam(value = "order", defaultValue = "ASC", required = false) Sort.Direction direction,
			@RequestParam(value = "sort", defaultValue = "name", required = false) String sortProperty) {
		return personService.findAll(page, count, direction, sortProperty);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Person person(@PathVariable Long id) {
		Person person = personService.find(id);
		if (person == null) {
			throw new PersonNotFoundException(id);
		}
		return person;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Person person) {
		personService.save(person);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
	public void patch(@PathVariable Long id, @RequestBody Person person) {
		person.setId(id);
		personService.save(person);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void save(@PathVariable Long id) {
		personService.delete(id);
	}

}

class PersonNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 5210422205093381211L;

	public PersonNotFoundException(Long id) {
		super("could not find user '" + id + "'.");
	}

}
