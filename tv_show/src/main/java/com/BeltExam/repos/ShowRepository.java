package com.BeltExam.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BeltExam.models.Show;

@Repository
public interface ShowRepository extends CrudRepository<Show, Long>{
	
	List<Show>findAll();
}
