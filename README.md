# Marks Management System

# IDE Used 
	Version: Oxygen.3a Release (4.7.3a)
	Build id: 20180405-1200

# Application Details
	This application is developed by using MVP (Model View Presenter) pattern. Where model can send data to view 
	via presenter and any event triggred in the view is reflected to the model via presenter.

# Key Words 
	bind, interface, model, view, presenter, database connectivity,getter, setter 

# In this Commit 
	The model, view and presenter are created. View and Presenter are bind so that 
	whatever the changes occurred in the presenter view will get notified and changes
	in view will get notified to presenter. Database connection has been done and for 
	now only specified student button is working. Remaining will be done later......
	
# For the database Connection 
	For the database connection, you need to define suitable dependencies and paste
	that to the pom.xml file otherwise you will get no suitable driver found exception. 
	You can create database into derby (in this project derby is used so), and create
	table named with any name and insert data. In this the table name is given as marks 
	and you can use following for creating and inserting data.....
	
	DROP TABLE MARKS;
	CREATE TABLE MARKS
	(
		STUDENTID VARCHAR (8) NOT NULL,
			ASSIGNMENT1 INT NOT NULL,
			ASSIGNMENT2 INT NOT NULL,
			EXAM INT NOT NULL,
			TOTAL INT NOT NULL,
		GRADE VARCHAR (4) NOT NULL,
		PRIMARY KEY (STUDENTID)
	);
	
	INSERT INTO MARKS(STUDENTID,ASSIGNMENT1,ASSIGNMENT2,EXAM,TOTAL,GRADE)
		VALUES 
	('S01',20,0,25,45,'?'),
	('S02',0,0,0,0,'?'),
	('S03',15,0,0,15,'?'),
	('S04',15,15,19,49,'?'),
	('S05',25,20,39,84,'?'),
	('S06',0,0,45,45,'?'), 
	('S07',25,25,0,50,'?'),
	('S08',20,20,25,65,'?'),
	('S09',20,20,24,64,'?'),
	('S10',17,19,39,75,'?');
	
