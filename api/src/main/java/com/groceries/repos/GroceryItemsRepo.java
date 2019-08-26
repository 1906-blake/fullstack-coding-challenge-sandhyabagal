package com.groceries.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groceries.models.GroceryItems;

public interface GroceryItemsRepo extends JpaRepository<GroceryItems, Integer> {
//	LibMember findByUsername(String username);
//
//	@Query("FROM LibMember lm WHERE lm.username = :username AND lm.password = :password")
//	LibMember findByUsernameAndPassword(String username, String password);
//	
}
