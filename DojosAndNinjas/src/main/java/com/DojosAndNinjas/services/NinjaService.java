package com.DojosAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DojosAndNinjas.models.Ninja;
import com.DojosAndNinjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepo ninjaRepo;
	
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	public Ninja findByID(Long id) {
		Optional<Ninja> ninja = ninjaRepo.findById(id);
		
		if(ninja.isPresent()) {
			return ninja.get();
		}
		else {
			return null;
		}
		
	}
	public Ninja save(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public void delete(Long id) {
		ninjaRepo.deleteById(id);
	}
	
}