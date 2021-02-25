package com.dojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.models.Person;
import com.dojo.repos.PersonRepo;

@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;
	
//	public PersonService(PersonRepo personRepo) {
//		this.personRepo = personRepo;
//	}
	
	public List<Person> findAllPersons() {
		return personRepo.findAll();
	}
	
	public Person findPerson(Long id) {
		Optional<Person> p = personRepo.findById(id);
		
		if (p.isPresent()) {
			return p.get();
		} else {
			return null;
		}
	}
	
	public Person createPerson(Person p) {
		return personRepo.save(p);
	}
	
	public Person updatePerson(Long id, Person p) {
		Person person = findPerson(id);
		person.setFirstName(p.getFirstName());
		person.setLastName(p.getLastName());
		
		personRepo.save(person);
		
		return person;
	}
	
	public void deletePerson(Long id) {
		personRepo.deleteById(id);
	}
	
}
