package com.ajay.tagsvc.resources;

//This is differnet from Tag entity, good to have a different classes for model and API
public class TagResource {
	private long id;
	private String name;
	private String type;
	private long code;
	
	public TagResource() {
		
	}
	
	public TagResource(String n, String t, long c) {
		this.name = n;
		this.type = t;
		this.code = c;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
}
