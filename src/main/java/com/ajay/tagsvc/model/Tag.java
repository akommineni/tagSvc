package com.ajay.tagsvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAGS")
public class Tag {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="type")
	private String type;
	@Column(name="code")
	private Long code;
	
	public Tag() {}
	public Tag(String n, String t, long c) {
		this.name = n;
		this.type = t;
		this.code = c;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
		this.code= code;
	}
}
