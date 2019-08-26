package com.groceries.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "grocery_items")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})  // fixes lazyloading serialization error
public class GroceryItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "grocery_item_id")
	private int itemId;
		
	@Column(name = "item_name")
	private String itemName;

	@Column(name = "item_type")
	private String itemType;
		
		
// joining the grocery_list_info_id from this table (Grocery_Items) with the grocery_list_info_id
// from the Grocery_List_Info table
	@ManyToOne
	@JoinColumn(name = "grocery_list_info_id")
	private GroceryItems groceryListId;


public GroceryItems(int itemId, String itemName, String itemType, GroceryItems groceryListId) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
	this.itemType = itemType;
	this.groceryListId = groceryListId;
}


public int getItemId() {
	return itemId;
}


public void setItemId(int itemId) {
	this.itemId = itemId;
}


public String getItemName() {
	return itemName;
}


public void setItemName(String itemName) {
	this.itemName = itemName;
}


public String getItemType() {
	return itemType;
}


public void setItemType(String itemType) {
	this.itemType = itemType;
}


public GroceryItems getGroceryListId() {
	return groceryListId;
}


public void setGroceryListId(GroceryItems groceryListId) {
	this.groceryListId = groceryListId;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((groceryListId == null) ? 0 : groceryListId.hashCode());
	result = prime * result + itemId;
	result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
	result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
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
	GroceryItems other = (GroceryItems) obj;
	if (groceryListId == null) {
		if (other.groceryListId != null)
			return false;
	} else if (!groceryListId.equals(other.groceryListId))
		return false;
	if (itemId != other.itemId)
		return false;
	if (itemName == null) {
		if (other.itemName != null)
			return false;
	} else if (!itemName.equals(other.itemName))
		return false;
	if (itemType == null) {
		if (other.itemType != null)
			return false;
	} else if (!itemType.equals(other.itemType))
		return false;
	return true;
}


@Override
public String toString() {
	return "GroceryItems [itemId=" + itemId + ", itemName=" + itemName + ", itemType=" + itemType + ", groceryListId="
			+ groceryListId + "]";
}
	
	

}		