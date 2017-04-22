Bank System - Version 1.0 - 24/03/2016
By Ieuan Walker (ST20057645)

This application is to demonstrate the different functionality you would find in a bank system. 

Please follow the following steps to ensure the program will work properly.


1.	Install a webserver of your choice that runs PHPMyAdmin
		-	I would recommend wamp for windows
		-	And mamp for Macs
2.	Load PHPMyAdmin
		-	In a web browser travel to "localhost/phpmyadmin/"
		-	If the above doesn’t work and you are using mamp please try the following address "localhost:8888/phpMyAdmin", 8888 is the port that its running on.
3.	Create the database
		-	On the left of the page underneath the PHPMyAdmin logo, click the button "new".
		-	Name the database to anything you desire (dbBank).
		-	And click create.
4.	Import the database
		-	Make sure you click on the database you just created in the left column
		-	Click on import in the main navigation in the centre of the page.
		-	Click choose file
		-	Select bankdb.sql (located in the "program/" directory)
		-	Make sure the format is set to SQL
		-	Click go at the bottom of the page
5.	Check the properties file
		-	The properties file is called dbBank.properties (located in the "program/banksystem/" directory)
		-	Change the DB_URL, so that it is pointing at the database you just created
		-	Change the DB_USERNAME and DB_PASSWORD, to your websure credentials
				o	By default most webserver username is set to “root” and the password is "" blank. 
6.	Set up is name complete, you can run the main.java class to start the program.

PLEASE NOTE
	The database is filled with test data, please look through the tables using PHPMyAdmin to get the login details.
	
	To login in as a bank manager look at the table bankAdmin and use the ID column to get a username and get the corresponding 
	password from the password column. Do the same sort of thing when logging and a card holder go to the customerTbl.
