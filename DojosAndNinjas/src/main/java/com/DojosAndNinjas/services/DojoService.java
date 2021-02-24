package com.DojosAndNinjas.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DojosAndNinjas.models.Dojo;
import com.DojosAndNinjas.models.Ninja;
import com.DojosAndNinjas.repositories.DojoRepo;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepo dojoRepo;
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	public Dojo findByID(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		
		if(dojo.isPresent()) {
			return dojo.get();
		}
		else {
			return null;
		}
		
		}
	public Dojo save(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	public void delete(Long id) {
		dojoRepo.deleteById(id);
	}
	public Dojo addDojo(@Valid Long id) {
		return null;
		// TODO Auto-generated method stub
		
	}
	public List<Ninja> allNinjas() {
		return Ninja.findAll();
	}
	public void createNinja(@Valid Ninja ninja) {
		// TODO Auto-generated method stub
		
	}
	public Dojo singleDojo(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
