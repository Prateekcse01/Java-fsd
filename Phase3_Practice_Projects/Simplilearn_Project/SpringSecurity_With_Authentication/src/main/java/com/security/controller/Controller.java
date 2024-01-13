package com.security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.models.User;

import Services.UserService;

@RestController
@RequestMapping("/users")
public class Controller {
	
	private UserService userService ;
	
	@GetMapping("/")
	public List<User> getAllUsers(){
		
		
		return this.userService.getAllUsers();
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}
	
	@PostMapping
	public User add(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
	

}
