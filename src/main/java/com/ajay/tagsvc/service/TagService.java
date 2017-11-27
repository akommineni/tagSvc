package com.ajay.tagsvc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.tagsvc.model.Tag;
import com.ajay.tagsvc.repository.TagRepository;
import com.ajay.tagsvc.resources.TagResource;

@Service
public class TagService {
	@Autowired
	private TagRepository tagRepository;
	
	public List<TagResource> getAllTags() {
		Iterable <Tag> tags = tagRepository.findAll();
		ArrayList<TagResource> list = new ArrayList<TagResource> (); 
		for(Tag t: tags){
			TagResource r = new TagResource();
			r.setId(t.getId());
			r.setName(t.getName());
			r.setType(t.getType());
			r.setCode(t.getCode());
			list.add(r);
		}
		return list;
	}

	public void createTags(TagResource[] tags) {
		List<Tag> entities = new ArrayList<Tag>();
		for(TagResource t:tags) {
			Tag e = new Tag (t.getName(), t.getType(), t.getCode());
			entities.add(e);
		}
		tagRepository.save(entities);
	}
}
