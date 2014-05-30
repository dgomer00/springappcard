CREATE DATABASE springappcard;

GRANT ALL ON springappcard.* TO springappuser@'%' IDENTIFIED BY 'springappuser';
GRANT ALL ON springappcard.* TO springappuser@localhost IDENTIFIED BY 'pspringappuser';

USE springappcard;

CREATE TABLE comissions (
  id INTEGER PRIMARY KEY,
  description varchar(255),
  comission decimal(15,2)
);
CREATE INDEX comissions_description ON comissions(description);