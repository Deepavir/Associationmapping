package com.example.BlogApplication.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "posts")

public class Post {
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Tag> getTags() {
		return tags;
	}
	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String title;
	 private String description;
	 @JsonManagedReference
	 @ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.ALL,
	       
	                
	            } )
	    @JoinTable(name = "post_tags",
	            joinColumns = { @JoinColumn(name = "post_id") },
	            inverseJoinColumns = { @JoinColumn(name = "tag_id") })
	 private Set<Tag> tags = new HashSet<>();
	
}
