package com.BeltExam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.BeltExam.models.Show;
import com.BeltExam.repos.ShowRepository;

@Service
public class ShowsService {

	private ShowRepository showRepository;
	
	public ShowsService(ShowRepository showRepository) {
		this.showRepository = showRepository;
	}
	
	public List<Show> allShows() {
		return showRepository.findAll();
	}
	public Show findShowbyID(Long id) {
		Optional<Show> show = showRepository.findById(id);
		
		if(show.isPresent()) {
			return show.get();
		}
		else {
			return null;
		}
		
	}
	public Show save(Show s) {
		return showRepository.save(s);
	}
	public void deleteShow(Long id) {
		showRepository.deleteById(id);
	}
	
}
