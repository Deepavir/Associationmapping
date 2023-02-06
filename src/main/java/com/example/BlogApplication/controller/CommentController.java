package com.example.BlogApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BlogApplication.entity.Comment;

import com.example.BlogApplication.repository.CommentRepository;

@RestController
public class CommentController {

	@Autowired
	private CommentRepository commentrepo;
	
	@PostMapping("/addcomment")
	public void addData(@RequestBody Comment comment) {
		
		this.commentrepo.save(comment);
	}
	@GetMapping("/comment")
	public void getCommentData() {
		this.commentrepo.findAll();
	}
}
