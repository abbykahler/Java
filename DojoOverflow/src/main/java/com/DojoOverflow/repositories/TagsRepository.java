package com.DojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TagsRepository extends CrudRepository <TagsRepository, Long> {

}