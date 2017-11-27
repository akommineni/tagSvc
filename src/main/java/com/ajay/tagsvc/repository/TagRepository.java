package com.ajay.tagsvc.repository;

import org.springframework.data.repository.CrudRepository;
import com.ajay.tagsvc.model.Tag;

//No need of implementation
public interface TagRepository extends CrudRepository<Tag, Long>{

}
