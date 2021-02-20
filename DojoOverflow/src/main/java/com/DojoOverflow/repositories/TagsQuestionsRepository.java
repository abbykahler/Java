package com.DojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TagsQuestionsRepository extends CrudRepository <TagsQuestionsRepository, Long> { 

}