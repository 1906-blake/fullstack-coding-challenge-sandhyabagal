package com.groceries.repos;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import com.groceries.models.GroceryList;

public interface GroceryListRepo extends JpaRepository<GroceryList, Integer>{

GroceryList saveAndFlush(GroceryList groceryList);
//
//@Query("SELECT r FROM Book r WHERE r.rating BETWEEN :rating AND 5 ORDER BY r.rating")
//List<Book> findByRatingHql(@Param("rating") double rating);

@Query("DELETE FROM grocery_list_info WHERE grocery_list_info_id = :groceryListId")
List<GroceryList> deleteList(GroceryList groceryList); // deletes a grocery list


GroceryList addItemToList(GroceryList groceryList);


List<GroceryList> deleteItemFromList(GroceryList groceryList);

}
