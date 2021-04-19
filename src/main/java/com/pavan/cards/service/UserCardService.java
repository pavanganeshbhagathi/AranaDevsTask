package com.pavan.cards.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pavan.cards.model.UsersCards;
import com.pavan.cards.repository.UsersCardsRepository;

@Service
public class UserCardService {

@Autowired
public UsersCardsRepository usersCardsRepository;


public UsersCards saveUserCards(UsersCards usersCard)
{
	return usersCardsRepository.save(usersCard);
}
}
