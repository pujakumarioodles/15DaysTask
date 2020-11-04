package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	

	@Autowired
	private UserRepo userRepo;	


	@Override
	public List<User> getUser() {
	
		return  userRepo.findAll() ;
	}

	@Override
	public Optional<User> getUser(int userId) {
		
		return userRepo.findById(userId);
	}

	@Override
	public User addUser(User user) {
		
		
		return userRepo.save(user);
	}

	@Override
	public User updateUserDetails(User user) {
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		userRepo.deleteById(userId);
		
	}

	}
