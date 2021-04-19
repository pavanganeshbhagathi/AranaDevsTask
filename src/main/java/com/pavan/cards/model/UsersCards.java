package com.pavan.cards.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "users_cards", catalog = "test")
@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UsersCards {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @Column(name = "user_card_id")
    private Long id;
    private Long totalBalance;

    @Column(name = "user_id")
    private Long userId;

	

}
