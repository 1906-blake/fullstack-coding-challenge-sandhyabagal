package com.groceries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groceries.models.GroceryList;
import com.groceries.services.GroceryListService;

@RestController
@RequestMapping("/grocery-lists")
public class GroceryListController {

@Autowired
private GroceryListService groceryListService;


@GetMapping
public List<GroceryList> findAll() {
	return groceryListService.findAll();
}

@DeleteMapping
public List<GroceryList> deleteList(@PathVariable GroceryList groceryList) {
	return groceryListService.deleteList(groceryList);
}

@DeleteMapping("/items/{itemId}")
public List<GroceryList> deleteItemFromList(@PathVariable GroceryList groceryList) {
	return groceryListService.deleteItemFromList(groceryList);
}

@PostMapping
public GroceryList addList(@RequestBody GroceryList groceryList) {
	return groceryListService.saveAndFlush(groceryList);
}

@PostMapping("/{groceryListId}/items/{itemId}")
public GroceryList addItemTolist(@RequestBody GroceryList groceryList) {
	return groceryListService.addItemToList(groceryList);
}
}