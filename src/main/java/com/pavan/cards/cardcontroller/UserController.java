package com.pavan.cards.cardcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.pavan.cards.model.UsersCards;
import com.pavan.cards.service.UserCardService;
import com.pavan.cards.service.UserService;
import com.pavan.cards.service.UserTransctionService;
import com.pavan.cards.model.UserTransction;
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserCardService userCardService;
	
	@Autowired
	UserTransctionService userTransctionService;
	
	
	@PostMapping(path="/usersCardCreate")
	public ResponseEntity<UsersCards>  saveUserCards(@Valid @RequestBody UsersCards usersCards)
	{	
	
		UsersCards saveUserCards = userCardService.saveUserCards(usersCards);

		return new ResponseEntity<UsersCards>(saveUserCards, HttpStatus.CREATED);
	
	}
	
	@PostMapping(path="/UserTransctionCreate")
	public ResponseEntity<UserTransction>  saveUserTransction(@Valid @RequestBody UserTransction userTransction)
	{	
	

		UserTransction saveUserCards = userTransctionService.saveUserCards(userTransction);

		return new ResponseEntity<UserTransction>(saveUserCards, HttpStatus.CREATED);
	}
	
	
	@GetMapping("Transction/userInput")
	@ResponseBody
	public ResponseEntity<List<UserTransction>>  getUserTransction(@RequestParam  String userInput,@RequestParam String sortingg)
	{	

		    List<UserTransction> data = userTransctionService.getData(userInput, sortingg);
				if(data.isEmpty())
				{
					return new ResponseEntity<List<UserTransction>>(data, HttpStatus.NOT_FOUND);
				}
					
		return new ResponseEntity<List<UserTransction>>(data, HttpStatus.FOUND);
	}
	

}
