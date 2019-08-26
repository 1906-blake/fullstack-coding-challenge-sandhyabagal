package com.groceries.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groceries.services.GroceryItemsService;


@RestController
@RequestMapping("/items")
public class GroceryItemsController {
	
	@Autowired
	private GroceryItemsService groceryItemsService;

//	@GetMapping
//	public List<LibMember> findAll() { //find all members
//		return memberService.findAll();
//	}
//	
//	@GetMapping("/{memberId}") // find member by memberId
//	public LibMember getOne(@PathVariable int memberId) {
//		return memberService.getOne(memberId);
//	}
//
//	@GetMapping("/username/{username}") // find user by username
//	public LibMember findByUsername(@PathVariable String username) {
//		return memberService.findByUsername(username);
//	}
//	
//	@PostMapping("/login")
//	public LibMember findByUsernameAndPassword(@RequestBody LibMember member) {
//		return memberService.findByUsernameAndPassword(member.getUsername(), member.getPassword());
//	}
//	
//	@PostMapping
//	public LibMember addMember(@RequestBody LibMember member) {
//		return memberService.saveAndFlush(member);
//	}
}
