package com.BeltExam.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BeltExam.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	public List<User> findAll();
	
	public User findByEmail(String email);
}
