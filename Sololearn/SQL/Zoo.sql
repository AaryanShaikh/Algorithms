/* name - "Slim", type - "Giraffe", country_id - 1 */
INSERT into
animals VALUES 
('Slim','Giraffe',1);
SELECT animals.name,animals.type,countries.country FROM animals inner join countries on animals.country_id = countries.id order by countries DESC;