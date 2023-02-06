package com.example.BlogApplication.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tags")
public class Tag {
	
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
	public Set<Post> getPosts() {
		return posts;
	}
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}
	//if tag deleted,post with referenced id will persist
	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 private String name;
	 @JsonBackReference
	 @ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	            		CascadeType.PERSIST
		             },
	            mappedBy = "tags")
	    private Set<Post> posts = new HashSet<>();
}
