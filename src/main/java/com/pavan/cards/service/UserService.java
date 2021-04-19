package com.pavan.cards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.cards.model.Users;
import com.pavan.cards.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	
	public Users saveUser(Users user)
	{
		return userRepository.save(user);
	}
	
	public List<Users> getUser(String username)
	{
		return userRepository.findByFirstNameNativeSQL(username);
	}
}
