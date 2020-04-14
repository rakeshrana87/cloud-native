DROP TABLE IF EXISTS billionaires;
 
CREATE TABLE Employee(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  company VARCHAR(250) NOT NULL,
  sex VARCHAR(250) NOT NULL,
  dept VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO Employee(first_name, last_name, company ,dept ,sex , employeeid)VALUES
  ('Rakesh', 'Rana', 'ABCCODE', 'R&D' ,'Male','123');