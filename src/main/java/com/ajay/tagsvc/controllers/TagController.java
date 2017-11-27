package com.ajay.tagsvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.tagsvc.resources.TagResource;
import com.ajay.tagsvc.service.TagService;

@RestController
@RequestMapping(value="/tags")
public class TagController {
	@Autowired
	private TagService tagService;	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<TagResource>> getTags(){
		return new ResponseEntity<List<TagResource>> (tagService.getAllTags(), HttpStatus.OK) ;
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity setTags(@RequestBody TagResource[] tags) {
		if (tags.length <= 0) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		} else {
			tagService.createTags(tags);
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		
	}
	
}
