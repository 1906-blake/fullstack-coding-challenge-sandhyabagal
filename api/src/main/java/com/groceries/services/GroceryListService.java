package com.groceries.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.groceries.models.GroceryList;
import com.groceries.repos.GroceryListRepo;

@Service
public class GroceryListService {

@Autowired
private GroceryListRepo groceryListRepo;

public List<GroceryList> findAll() {
return groceryListRepo.findAll();
}

public GroceryList saveAndFlush(GroceryList groceryList) {
return groceryListRepo.saveAndFlush(groceryList);
}

public List<GroceryList> deleteList(GroceryList groceryList) { // deletes a grocery list
	return groceryListRepo.deleteList(groceryList);
}

public GroceryList addItemToList(GroceryList groceryList) {
	return groceryListRepo.addItemToList(groceryList);
}

public List<GroceryList> deleteItemFromList(GroceryList groceryList) {
	return groceryListRepo.deleteItemFromList(groceryList);
}


}
