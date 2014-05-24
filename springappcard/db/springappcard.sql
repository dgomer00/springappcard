CREATE DATABASE springappcard;

GRANT ALL ON springappcard.* TO appcarduser@'%' IDENTIFIED BY 'pappcarduser';
GRANT ALL ON springappcard.* TO appcarduser@localhost IDENTIFIED BY 'pappcarduser';

USE springappcard;

CREATE TABLE comissions (
  id INTEGER PRIMARY KEY,
  description varchar(255),
  comission decimal(15,2)
);
CREATE INDEX comissions_description ON comissions(description);