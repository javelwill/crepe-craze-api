delete from Crepe_Order_Crepes;
delete from Crepe_Ingredients;
delete from Crepe;
delete from Crepe_Order;
delete from Ingredient;

insert into Ingredient (id, name, type, category)
                values ('STRA', 'Stawberries', 'SELECTION', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('BANA', 'Bananas', 'SELECTION', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('BLUB', 'Blueberries', 'SELECTION', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('BLAB', 'Blackberries', 'SELECTION', 'SWEET');

insert into Ingredient (id, name, type, category)
                values ('HAM', 'Ham', 'SELECTION', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('TURK', 'Turkey', 'SELECTION', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('TUNA', 'Tuna Salad', 'SELECTION', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('CHIC', 'Chicken Salad', 'SELECTION', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('EGG', 'Egg', 'SELECTION', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('BACN', 'Bacon', 'SELECTION', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('SAUS', 'Sausage', 'SELECTION', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('PEPP', 'Pepperoni', 'SELECTION', 'SAVORY');

insert into Ingredient (id, name, type, category)
                values ('VANC', 'Vanilla Cream', 'SPREAD', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('COSP', 'Chocolate', 'SPREAD', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('CCBL', 'Cream Cheese Blend', 'SPREAD', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('NUTL', 'Nutella', 'SPREAD', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('PBUT', 'Peanut Butter', 'SPREAD', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('GJLY', 'Grape Jelly', 'SPREAD', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('GPCH', 'Georgia Peach', 'SPREAD', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('APLE', 'Apple', 'SPREAD', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('SJLY', 'Strawberry Jelly', 'SPREAD', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('PINE', 'Pineapple', 'SPREAD', 'SWEET');

insert into Ingredient (id, name, type, category)
                values ('HMUS', 'Honey Mustard', 'SPREAD', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('DMUS', 'Dijon Mustard', 'SPREAD', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('YMUS', 'Yellow Mustard', 'SPREAD', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('KETC', 'Ketchup', 'SPREAD', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('MAYO', 'Mayonnaise', 'SPREAD', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('SALS', 'Salsa', 'SPREAD', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('SCRM', 'Sour Cream', 'SPREAD', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('HUMM', 'Hummus', 'SPREAD', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('PZSA', 'Pizza Sauce', 'SPREAD', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('BQSA', 'BBQ Sauce', 'SPREAD', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('RNCH', 'Ranch', 'SPREAD', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('TPHS', 'Texas Pete Hot Sauce', 'SPREAD', 'SAVORY');

insert into Ingredient (id, name, type, category)
                values ('CHOC', 'Chocolate', 'TOPPING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('CARA', 'Caramel', 'TOPPING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('MAPL', 'Maple Syrup', 'TOPPING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('HONE', 'Honey', 'TOPPING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('WALT', 'Walnuts', 'TOPPING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('CHER', 'Cherries', 'TOPPING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('CRPR', 'Crushed Pretzels', 'TOPPING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('CRCR', 'Crushed Graham Crackers', 'TOPPING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('CROR', 'Crushed Oreos', 'TOPPING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('NUTS', 'Crushed Nuts', 'TOPPING', 'SWEET');

insert into Ingredient (id, name, type, category)
                values ('MUSH', 'Mushrooms', 'TOPPING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('ONIO', 'Onions', 'TOPPING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('GRPE', 'Green Peppers', 'TOPPING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('JALA', 'Jalapenos', 'TOPPING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('SPIN', 'Spinach', 'TOPPING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('TOMA', 'Tomatoes', 'TOPPING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('LETC', 'Lettuce', 'TOPPING', 'SAVORY');

insert into Ingredient (id, name, type, category)
                values ('MARS', 'Marshmallow', 'DUSTING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('PSUG', 'Powdered Sugar', 'DUSTING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('SUGR', 'Sugar', 'DUSTING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('CINN', 'Cinnamon', 'DUSTING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('CSUG', 'Cinnamon Sugar', 'DUSTING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('CSYR', 'Chocolate Syrup', 'DUSTING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('CSPR', 'Chocolate Sprinkles', 'DUSTING', 'SWEET');
insert into Ingredient (id, name, type, category)
                values ('RSPR', 'Rainbow Sprinkles', 'DUSTING', 'SWEET');

insert into Ingredient (id, name, type, category)
                values ('SOIL', 'Special Oil', 'DUSTING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('BASL', 'Basil', 'DUSTING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('ORGO', 'Oregano', 'DUSTING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('CRRP', 'Crushed Red Pepper', 'DUSTING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('SESA', 'Sesame or Celery Seeds', 'DUSTING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('OBAY', 'Old Bay', 'DUSTING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('SALT', 'Salt', 'DUSTING', 'SAVORY');
insert into Ingredient (id, name, type, category)
                values ('PEPR', 'Pepper', 'DUSTING', 'SAVORY');



