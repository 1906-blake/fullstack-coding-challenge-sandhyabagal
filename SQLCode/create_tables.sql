-- create grocery list info table
CREATE TABLE grocery_list_info (
	grocery_list_info_id SERIAL PRIMARY KEY,
    store_name TEXT NOT NULL
);

-- create grocery items table
CREATE TABLE grocery_items (
    grocery_item_id SERIAL PRIMARY KEY,
    item_name TEXT NOT NULL,
    -- FK is grocery_list_info_id
    grocery_list_info_id SERIAL NOT NULL REFERENCES grocery_list_info(grocery_list_info_id),
    item_type TEXT NOT NULL
);