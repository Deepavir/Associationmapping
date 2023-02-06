package com.example.BlogApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BlogApplication.entity.User;
import com.example.BlogApplication.entity.UserProfile;
import com.example.BlogApplication.repository.UserProfileRepository;
import com.example.BlogApplication.repository.UserRepo;


@RestController
public class UserController {
	
	@Autowired
	private UserRepo userrepo;
	
	@PostMapping("/adduser")
	public void addNewUser(@RequestBody User user) {
		this.userrepo.save(user);
		
	}
	@GetMapping("/getuser")
	public void getAllUser() {
		this.userrepo.findAll();
		
	}
}
