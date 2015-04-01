package org.guneriu.springboot.data.repository;

import org.guneriu.springboot.data.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

}
