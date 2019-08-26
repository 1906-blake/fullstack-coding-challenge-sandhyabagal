package com.groceries.models;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.orm.jpa.JpaSystemException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "grocery_list_info")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class GroceryList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "grocery_list_info_id")
	private int groceryListId;
	
	@Column(name = "store_name")
	private String storeName;
	
	//generated constructor using fields
	public GroceryList(int groceryListId, String storeName) {
		super();
		this.groceryListId = groceryListId;
		this.storeName = storeName;
	}
// getters and setters
	public int getGroceryListId() {
		return groceryListId;
	}

	public void setGroceryListId(int groceryListId) {
		this.groceryListId = groceryListId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groceryListId;
		result = prime * result + ((storeName == null) ? 0 : storeName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryList other = (GroceryList) obj;
		if (groceryListId != other.groceryListId)
			return false;
		if (storeName == null) {
			if (other.storeName != null)
				return false;
		} else if (!storeName.equals(other.storeName))
			return false;
		return true;
	}
// generated toString	
	@Override
	public String toString() {
		return "GroceryList [groceryListId=" + groceryListId + ", storeName=" + storeName + "]";
	}
	
}