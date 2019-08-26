INSERT INTO grocery_list_info (grocery_list_info_id, store_name)
    VALUES (1, 'Giant'),
            (2, 'Home Goods'),
            (3, 'Target'),
            (4, 'Best Buy'),
            (5, 'Whole Foods'),
            (6, 'Walmart'),
            (7, 'Costco'),
            (8, 'Express'),
            (9, 'Lord and Taylor'),
            (10, 'Banana Republic'),
            (11, 'Aldis');

INSERT INTO grocery_items (grocery_item_id, item_name, grocery_list_info_id, item_type)
    VALUES (1, 'Apples', 1, 'Food'),
            (2, 'Ground Turkey', 1, 'Food'),
            (3, 'Skinny Jeans', 8, 'Clothing'),
            (4, 'Tank top', 3, 'Clothing'),
            (5, 'Spinach', 11, 'Food'),
            (6, 'Milk', 11, 'Food'),
            (7, 'Chips', 7, 'Food'),
            (8, 'Toilet Paper', 7, 'Other'),
            (9, 'Airpods', 4, 'Electronics'),
            (10, 'Macbook Pro', 4, 'Electronics'),
            (11, 'Blouse', 9, 'Clothing');