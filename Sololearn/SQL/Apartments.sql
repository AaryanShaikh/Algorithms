SELECT * FROM apartments where price > (SELECT avg(price) from apartments) AND status = 'Not rented' ORDER by price