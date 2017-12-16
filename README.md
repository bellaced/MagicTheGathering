Michael Brutsch 
Isabella Cedric
Jerry Martin

We tried to make an exectuable, but the .jar file ends up being specific
to Isabella's login information for the connection. 
We are not sure how to bypass that without downloading NetBeans to
your own computer. 


INSTRUCTIONS TO RUN THE MAGIC THE GATHERING CARD DATABASE:

-Download Netbeans

-Unzip MagicTheGathering.zip

-Load the Magic.sql file to your mysql database

-In Netbeans, click file > Open Project
Where it says "Look in" in the drop down box, have MagicTheGathering displayed.
Select NetbeansGUI and click Open Project

-In the left hand corner under "Projects" you should see our Magic project. 
click the small box to the left to open the drop down list. 

-Open the drop down list for "Libraries."
	Make sure you have the mysql-connector .jar file
	AND the JDK included. If these are not present, right click on Libraries
	select "Add JAR/file" and add these into your Libraries folder. 

-You will have to change the connection establishment to your username/password 

change connection establishment in MainPage.java in the JButton1ActionPerformed method
change connection establishment in Main.java in the main method
change connection establishment in ResultsPage.java in the showRating method

Save your changes to all files. 



AT THIS POINT OUR PROJECT SHOULD BE READY FOR YOU TO TEST: 

If you would like to run our project in Netbeans:
Select our Magic project, and click on the Green Play Arrow in the top of the menu.

 

If you would prefer to make an executable to run in terminal:
Click on the Hammer and Brush Icon at the top of the page to "Clean and Build project" 

In terminal, change directory to dist folder
MagicTheGathering/NetbeansGUI/dist

To run executable jar file, use command:
java -jar Magic.jar
