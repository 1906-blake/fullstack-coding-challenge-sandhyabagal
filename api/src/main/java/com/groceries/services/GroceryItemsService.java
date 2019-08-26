package com.groceries.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groceries.models.GroceryItems;
import com.groceries.repos.GroceryItemsRepo;


@Service
public class GroceryItemsService {
	@Autowired
	private GroceryItemsRepo groceryItemsRepo;
	
	public List<GroceryItems> findAll() {
		return groceryItemsRepo.findAll();
	}
//
//	public LibMember getOne(int id) {
//		return memberRepo.getOne(id);
//	}
//
//	public LibMember findByUsername(String username) {
//		return memberRepo.findByUsername(username);
//	}
//
//	public LibMember saveAndFlush(LibMember member) {
//		return memberRepo.saveAndFlush(member);
//	}
//
//	public LibMember findByUsernameAndPassword(String username, String password) {
//		return memberRepo.findByUsernameAndPassword(username, password);
//	}
//	
//	public LibMember addMember(LibMember member) {
//		return memberRepo.saveAndFlush(member);
//	}
}
