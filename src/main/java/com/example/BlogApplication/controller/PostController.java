package com.example.BlogApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BlogApplication.entity.Post;
import com.example.BlogApplication.repository.PostRepository;
import com.example.BlogApplication.repository.TagRepository;

@RestController
public class PostController {
	
	@Autowired
	private PostRepository postrepo;
	
	@Autowired
	private TagRepository tagrepo;
	
	@PostMapping("/add")
	public void addData(@RequestBody Post post) {
		
		this.postrepo.save(post);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteData(@PathVariable Long id) {
		this.postrepo.deleteById( id);
	}
	@GetMapping("/get")
	public List<Post> getAllData(){
		return this.postrepo.findAll();
	}
	@DeleteMapping("/delete/tag/{id}")
	public void deleteTagData(@PathVariable Long id) {
		this.tagrepo.deleteById( id);
	}
}
