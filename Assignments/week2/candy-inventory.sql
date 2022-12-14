create table inventory (
	id int primary key,
	name text,
	price decimal,
	description text,
	quantity int
);

insert into inventory 
values
	(1001, 'Hershey Bar', 3.45, 'A small chocolate bar', 50),
	(1002, 'Skittles', 3.05, ' A bag of rainbow colored candies', 100),
	(2003, 'Gummy Bears', 5.55, 'A large bag of chewy fruit-flavored bears', 48),
	(2005, 'Sour Gummy Worms', 9.55, 'A very large bag of gelatin worms', 20),
	(3008, 'Lollipop', 2.25, 'A hard candy atop a stick', 268),
	(9007, 'M&Ms', 1.95, 'A bag of small chocolate candies', 58);
	
update inventory set quantity = 48 where id = 1001;

select name, price from inventory;

update inventory set description = 'A very large, delicious bags of worms' where id = 2005;
update inventory set quantity = 100  where id = 9007;
update inventory set price = 2.50 where id = 3008;



create table employees(
	id int,
	"first" varchar(20),
	"last" varchar(20),
	favor_candy int references inventory
);

insert into employees
values
	(4001, 'Willy', 'Wonka', 2005),
	(4002, 'Milton', 'Hersey', 1001),
	(4003, 'Franklin', 'Mars', 9007),
	(4004, 'John', 'Cadbury', null);


select "name"
from inventory 
left join employees on employees.favor_candy = inventory.id;



