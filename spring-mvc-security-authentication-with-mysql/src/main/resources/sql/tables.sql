CREATE TABLE spring_users ( 
	username VARCHAR(50) NOT NULL , 
	password VARCHAR(50) NOT NULL , 
	enabled INT NOT NULL DEFAULT 1 , 
	PRIMARY KEY (username)
); 

CREATE TABLE spring_user_roles ( 
	user_role_id int(11) NOT NULL AUTO_INCREMENT, 
	username varchar(50) NOT NULL, 
	role varchar(50) NOT NULL, 
	PRIMARY KEY (user_role_id), 
	FOREIGN KEY (username) REFERENCES spring_users (username)
); 

/**** dummy records ******/ 
INSERT INTO spring_users(username,password,enabled) 
VALUES ('sunglowsys','12345', true); 
INSERT INTO spring_users(username,password,enabled) 
VALUES ('codingraja','123456', true); 

INSERT INTO spring_user_roles (username, role) 
VALUES ('sunglowsys', 'ROLE_USER'); 
INSERT INTO spring_user_roles (username, role) 
VALUES ('sunglowsys', 'ROLE_ADMIN'); 
INSERT INTO spring_user_roles (username, role) 
VALUES ('codingraja', 'ROLE_USER');

