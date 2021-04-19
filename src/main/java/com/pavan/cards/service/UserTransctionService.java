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
	
	//saving Transection Data
	public UserTransction saveUserCards(UserTransction userTransction)
	{
		return userTransctionRepository.save(userTransction);
	}
	
	// here col related column and sorting ASC or DESC
	//gettting data from backend showing transection
	public List<UserTransction> getData(String col,String sortingg)
	{
		return userTransctionRepository.findByFirstNameNativeSQL(col, sortingg);
	}
	
}
