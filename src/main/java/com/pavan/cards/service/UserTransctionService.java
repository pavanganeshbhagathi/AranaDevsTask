package com.pavan.cards.service;


import java.util.List;

import javax.persistence.EntityManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.cards.model.UserTransction;

import com.pavan.cards.repository.UserTransctionRepository;

@Service
public class UserTransctionService {
	@Autowired
	EntityManager em;
	@Autowired
	UserTransctionRepository userTransctionRepository;
	
	public UserTransction saveUserCards(UserTransction userTransction)
	{
		return userTransctionRepository.save(userTransction);
	}
	
	
	public List<UserTransction> getData(String col,String sortingg)
	{
		return userTransctionRepository.findByFirstNameNativeSQL(col, sortingg);
	}
	
}
