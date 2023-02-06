package com.example.BlogApplication.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comments")
public class Comment {
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String text;

	  @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "post_id", nullable = false)
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    private Post post;
}
