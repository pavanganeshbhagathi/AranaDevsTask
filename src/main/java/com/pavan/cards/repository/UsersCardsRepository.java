package com.pavan.cards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.pavan.cards.model.UsersCards;

@Repository
public interface UsersCardsRepository extends JpaRepository<UsersCards, Long> {

}
