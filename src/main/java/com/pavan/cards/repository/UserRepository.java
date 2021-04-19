package com.pavan.cards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pavan.cards.model.Users;



@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

@Query(value = "SELECT * FROM Users e WHERE e.name= :firstName ORDER BY e.name ASC",
            nativeQuery = true)
List<Users> findByFirstNameNativeSQL(@Param("firstName") String firstName);
}
