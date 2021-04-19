package com.pavan.cards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pavan.cards.model.UserTransction;



@Repository
public interface UserTransctionRepository extends JpaRepository<UserTransction, Long> {

	
  // @Query(value = "SELECT u.user_id,u.name,ut.transction_id,ut.t_amount,ut.t_date,t_desc FROM users as u INNER JOIN user_transction as ut ON u.user_id = ut.user_id  WHERE  concat(u.name,ut.transction_id , ut.t_amount , ut.t_desc ,ut.user_id ) LIKE %:left% ORDER BY concat (ut.t_date , :or , ut.t_desc , :or );", nativeQuery = true)
  // List<ResultData> findByFirstNameNativeSQL(@Param("left") String firstName,@Param("or") String or);
	
   @Query(value = "SELECT * FROM user_transction ut WHERE  concat(ut.transction_id , ut.t_amount , ut.t_desc ,ut.user_id ) LIKE %:left% ORDER BY concat (ut.t_date , :or , ut.t_desc , :or );", nativeQuery = true)
   List<UserTransction> findByFirstNameNativeSQL(@Param("left") String firstName,@Param("or") String or);
	
	

}
