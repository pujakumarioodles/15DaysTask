package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	
	List<User> list;
	
	
	public UserServiceImpl() {
		list=new ArrayList<>();
		list.add(new User(1,"puja","puja.kumari@oodlestechnologies.com","puja1244",20000,"employee"));
		list.add(new User(2,"anu","pujakumari16935@gmail.com","anu4390",30000,"user"));
		list.add(new User(3,"anuska","anuskakumari@gmail.com","anuska4390",40000,"admin"));
		list.add(new User(4,"partek","partekkumar@gmail.com","partek4390",50000,"manager"));
		
	}

	@Override
	public List<User> getUser() {
	
		return list;
	}

	@Override
	public User getUser(int userId) {
		User u=null;
		for(User user:list)
		{
			if(user.getId()==userId)
			{
				u=user;
				break;
			}
		}
		return u;
	}

	@Override
	public List<User> addUser(User user) {
		
		list.add(user);
		return list;
	}

	@Override
	public List<User> updateUserDetails(User user) {
		User u=null;
		for(User user1 :list)
		{
			if(user1.getId()==user.getId())
			{
				u.setName(user.getName());
				u.setEmailid(user.getEmailid());
				u.setPassword(user.getPassword());
				u.setRole(user.getRole());
				u.setSalary(user.getSalary());
				list.remove(user1);
				list.add(u);
				break;
		}}
		return list;
	}

	@Override
	public List<User> deleteUser(int userId) {
		User u=null;
		for(User user1 :list)
		{
			if(user1.getId()==userId)
			{
				list.remove(user1);
				break;
		}}
		return list;
		
	}

	}
