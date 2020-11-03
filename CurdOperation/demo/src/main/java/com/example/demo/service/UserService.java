package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.User;

public interface UserService {

	public List<User> getUser();

	public User getUser(int userId);
	public List<User> addUser(User user);
	public List<User>  updateUserDetails(User user);
	public List<User> deleteUser(int userId);
}
