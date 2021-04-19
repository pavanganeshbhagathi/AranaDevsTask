package com.pavan.cards.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table
public class UserTransction {

	@Id
	@GeneratedValue
	private Long transctionId;
	
	private Long tAmount;
	

	private String tDate;
	
	private String tDesc;
	
	 @Column(name = "user_id")
	 private Long userId;
	
	
}
