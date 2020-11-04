package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserRegistrationController {
	
	@Autowired
	private UserService userService;
	
	// to add new User
	@PostMapping(path="/user" , consumes="application/json")
	public User addUser(@RequestBody User user)
	{
	return  this.userService.addUser(user);	
		
	}
	
	
	// to get all user
	@GetMapping("/user")
	public List<User> getALLUser()
	{
		System.out.println("puja1234");
		return this.userService.getUser();
		
	}
	
	//to get particular user on the basis of id
	@GetMapping("/user/{userId}")
	public Optional<User> getUser(@PathVariable int userId)
	{
		System.out.println("puja123");
		return this.userService.getUser(userId);
		
	}
	
	// to update user on the basis of id
	  @PutMapping(path="/user" ,consumes="application/json")
	  public User  updateUserDetails(@RequestBody User user)
	  {
		return this.userService.updateUserDetails(user);  
	  }
	  
	  
	  // to delete user on the basis of usrid
	@DeleteMapping("/user/{userId}")
	public void deleteUser(@PathVariable int userId)
	{
		 this.userService.deleteUser(userId);
	}
}
