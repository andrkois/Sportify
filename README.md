# Sportify
This is a social media app. We created this app for a university project.

Instructions for compilation:
-----------
If you want to compile our java project you should download first the src\main\java directory, which includes the java files. You should also have the pom.xml file and the three Serialized files UserInfo.ser, AthleteInfo.ser, CoachInfo.ser so that you can use the stored data for the Users, Athletes and Coaches objects. After downloading the necessary files, please create a new folder and place in it the src\main\java directory, the pom.xml and the serialized files. Bear in mind that all the files that you have downloaded from git should be unzipped. For the compilation of the project use the **maven** tool, which you can download from https://maven.apache.org/download.cgi. Then, open the command line prompt and move to the directory of the folder that you have created, with the cd command. Use the command **mvn compile** to compile the project and then the command **mvn package** so that you create a jar file, which you can use to run our social media app.

Instruction for executing the program:
-----------
After you have created the **jar** file, you can run the project by using the command **java -jar target\sportify-0.1.0.jar**. The target directory in the command is created when you are packaging the project and it includes the executable jar file. The sportify-0.1.0 is the name of the project followed by its version.


Instructions for use:
--------------------

When running the code the user is faced with the question of whether they like to log in or register.
The **register** option is used to create a new account for a coach or an athlete who sets a **unique** username and a password for them in order to **log-in** the next time they use our app.
**Log-in** option can be used when a user already has an account and wants to enter our app.
Based on the type of user (Coach/ Athlete) the rest of the application is different.

Menu of a coach:
After logging in as a coach the following menu appears on the screen: 
***Type : 1 to edit your profile 2. to view it 3. to search for athletes 4. to see a Chat 5. to send a message 6. to logout***
1. The coach can edit everything regarding their profile 
2. The coach can view their complete profile 
3. The coach can search for athletes (This also gives them the opportunity to see the top players based on likes etc) 
4. The coach can see an already open chat between them and an athlete 
5. The coach can open a chat and send a message to an athlete or send a message to an already open chat. 
6. The coach logs out. After logging out everything is saved.

Menu of an athlete:
After logging in as an athlete the following menu appears on the screen: 
***Type : 1. to edit your profile 2. to view your profile 3. to see a Chat 4. to send a message 5. to log out***
1. The athlete can edit everything regarding their profile 
2. The athlete can view their complete profile 
3. The athlete can see an already open chat between them and a coach 
4. The athlete can send a message to an already open chat between them and a coach 
5. The athlete logs out. After logging out everything is saved.


Structure of git repository
--------

The structure of our git repository contains the default branch named ***main***, the ***Serialize*** branch, and the ***MAIN-FINAL*** branch.

The default branch ***main*** consists of all the final classes ready to be used by the users. Except for the .java files, it also includes 3 byte files (***UserInfo.ser, AthleteInfo.ser, CoachInfo.ser***). The last three files contain all of the data generated by the program. The branch also has the ***README.md*** file.

The ***Serialize*** branch was created in order for the program to be able to run for the first time. In particular, the **Main.java** file creates the *.ser* files and stores some sample values. The *.ser* files were then transferred into the ***main*** branch so that the **Main.java** can deserialize them and execute them. This branch is not used during the execution of the app.

In the beginning, the different operations were assigned to two-person teams and each team had its own branch. For instance, there was a ***Chat*** branch. After the codes were finished, all *.java* files were transferred into the ***MAIN-FINAL*** branch and then were deleted for illustrating purposes.

The ***MAIN-FINAL*** branch was the testing branch in which everyone committed their code and updated the classes.


5o bullet
-----

Data structure and algorithms used by the application
------

The storing of our data happens in *.ser* files. More specifically, we created 3 array lists (*usersarray*, *coachesarray*, *athletesarray*) that contain the objects of each *User*, *Coach*, *Athlete* in the corresponding order. In the begging of the program, the array lists are deserialized (converted from bytes to objects) and are now ready to be used by the program without any needed connection with another database. At the end of the program execution, the updated by the users array lists are serialized, overriding the previous ones and being converted into bytes.
Inside *coachesarray* and *athletesarray* there is another ArrayList called *messages*. This *messages* ArrayList is an instance variable of type Users, which is inherited by the Athletes and Coaches objects. It consists of many ArrayLists, each one representing a chat of the user with someone. These ArrayLists also consist of ArrayLists, with the latter representing a message and their sender. In this way, all messages can be saved. It must be noted that the **first** ArrayList inside the ArrayLists that represent a chat consists of only a String, the username of the contact.

Users Class 
---------------
The class uses inheritance and is the superclass of the subclassses Athletes and Coaches.
The class, also implements the Serializable interface.

It is a public class which contains lots of set and get methods for several private instance variables, which are used for the attributes of a User. 
- **Users** method is the constructor method of the "Users" class and it has three attributes String "username",String "password",String "choice". The choice attribute is for the user to choose if he is an athlete of a coach.

- **setName** is a void setter method in the "Users" class. It sets the value of the "name" instance variable to the value passed in as the parameter "n". This method can be called on an instance of the "Users" class and takes a String as an argument, which will be stored in the "name" instance variable.

- **getName** is a String getter method which returns the name of the user when the user wants to view his profile.

- **setAge** is a void setter method in the "Users" class. It sets the value of the "age" instance variable to the value passed in as the parameter "a". This method can be called on an instance of the "Users" class and takes an integer as an argument, which will be stored in the "age" instance variable.

- **getAge** is a int getter method which returns the age of the user when the user wants to view his profile.

- **setSport** is a void setter method in the "Users" class. It sets the value of the "sport" instance variable to the value passed in as the parameter "s". This method can be called on an instance of the "Users" class and takes a String as an argument, which will be stored in the "sport" instance variable.

- **getSport** is a String getter method which returns the sport of the user when the user wants to view his profile.

- **setBio** is a void setter method in the "Users" class. It sets the value of the "bio" instance variable to the value passed in as the parameter "b". This method can be called on an instance of the "Users" class and takes a String as an argument, which will be stored in the "bio" instance variable. The bio can include multiple information about the user. e.g if the user is a footballer it could contain his goals per match.

- **getBio** is a String getter method which returns the bio of the user when the user wants to view his profile. 

- **setUsername** is a void setter method in the "Users" class. It sets the value of the "username" instance variable to the value passed in as the parameter "usern". This method can be called on an instance of the "Users" class, and takes a String as an argument, which will be stored in the "username" instance variable.

- **getUsername** is a String getter method which returns the username of the user.

- **setPassword*** is a void setter method in the "Users" class. It sets the value of the "password" instance variable to the value passed in as the parameter "p". This method can be called on an instance of the "Users" class, and takes a String as an argument, which will be stored in the "password" instance variable.

- **getPassword** is a String getter method which returns the password of the user.

- **getMessages** is a getter method in the "Users" class, it returns the "messages" instance variable, which is an ArrayList of ArrayLists of ArrayLists of Strings. This method can be called on an instance of the "Users" class, and returns the value stored in the "messages" variable. It does not take any arguments.

Athletes Class 
-----------------
It is a public class which extends the "Users" class and also implements the Serializable interface. 
It contains multiple private instance variables which are used to describe the attributes of an Athlete.

- **Athletes** method is the constructor method of "Athletes" class that calls the constructor of the superclass passing the parameters "usern"(for the username),"p" (for password)and "c" (for choice).

- **setPosition** is a void setter method which sets the value of the "position" instance variable to the value passed in as the parameter "p". This method can be called on an instance of the "Athletes" class, and takes a String as an argument, which will be stored in the "position" instance variable.

- **getPosition** is a String getter method which returns the position of an Athlete.

- **setCurrent_team** is a void setter method which sets the value of the "current_team" instance variable to the value passed in as the parameter "ct". This method can be called on an instance of the "Athletes" class, and takes a String as an argument, which will be stored in the "current_team" instance variable.

- **getCurrent_team** is a String getter method which returns the current team of an Athlete.

- **setHeight** is a a void setter method which sets the value of the "height" instance variable to the value passed in as the parameter "h". This method can be called on an instance of the "Athletes" class, and takes a double as an argument, which will be stored in the "height" instance variable.

- **getHeight** is a double getter method which returns the height of an Athlete.

- **setWeight** is a void setter method which sets the value of the "weight" instance variable to the value passed in as the parameter "w". This method can be called on an instance of the "Athletes" class, and takes a double as an argument, which will be stored in the "weight" instance variable.

- **getWeight** is a double getter method which returns the weight of an Athlete.

Then we have three different **edit** methods which differ in the type of the attributes they receive depending the type of the instance variables the athlete wants to change. The methods are called by the user in main class when he chooses the edit option in the menu and he gives a number (1-8) according to what he wants to change as well as the new value.

- The **first** one is used when having **String** such as the name, sport, bio, postion and current_team.

- The **second** one is used when having **double** such as the height and the weight.

- The **third** one is used when having **int** which is the age.

- **getLikes** is a int getter method which returns the Likes of an athlete.

- **addLikes** is a void method which adds one like to an athlete when a coach likes his profile.

Coaches Class
---------------
It is a public class which extends the "Users" class and also implements the Serializable interface. 
It contains multiple private instance variables which are used to describe the attributes of a Coach.

- **Coaches** method is the constructor method of "Coaches" class that calls the constructor of the superclass passing the parameters "usern"(for the username),"p" (for password)and "c" (for choice).

- **setYears** is is a void setter method which sets the value of the "years_of_experience" instance variable to the value passed in as the parameter "y". This method can be called on an instance of the "Coaches" class, and takes an int as an argument, which will be stored in the "years_of_experience" instance variable.

- **getYears** is a int getter method which returns the years of experience of a coach.

- **setTeam** is a void setter method which sets the value of the "team" instance variable to the value passed in as the parameter "t". This method can be called on an instance of the "Coaches" class, and takes a String as an argument, which will be stored in the "team" instance variable.

- **getTeam** is an int getter method that return the team that the coach is in.

Then we have two different **edit** methods which differ in the type of the attributes they receive depending the type of the instance variables the coach wants to change. The methods are called by the user in main class when he chooses the edit option in the menu and he gives a number (1-6) according to what he wants to change as well as the new value.

- The **first** one is used when having an **int** such as age and years of experience.

- The **second** one is used when having **String** such as name, bio and team.

Chat Class
------------

Chat class is responsible for the chats between athletes and coaches.
Messages are stored in an ArrayList<Arraylist<Arraylist<String>>>.
The bigger ArrayList contains all the messages of a user.
The second bigger ArrayList contains all the messages between two users
The smallest Arraylist contains the message sent in the conversation between the two aforementioned users. More specifically, it has the form of <name of sender, message>

- **OpenChat** method is used to open a chat between a coach and an athlete. It uses Arraylists to save the messages.
 It is important to know that only a coach can open a chat.
 
- **CheckChat** method is used to check if there is already a chat between a coach and an athlete.
 Returns boolean (true if there is a chat and false if there is not).
 If there is not and open chat and the method is called by an athlete a chat is opened, otherwise it returns error messages to the user.
 
- **SeeConversation** method is used so the user can see the whole conversation between them and a coach/ athlete.

- **SendMessage** method is used to send and save a new message.
 Sender is the user that calls the method and the receiver is given as an argument.
 The method saves the name of the sender next to their message and inserts them to the Arraylists of both the sender and the receiver.
 
 ## AthletesActions
 ------------

AthletesActions class is responsible for the actions of the athletes. Everything an athlete can do 
in our service happens inside AthletesActions.

- **The constractor** asigns the object a to an instance variable called athlete 

- **showProfile** method is used to show the whole profile of the athlete

- **seeWholeConversation** method is used to show the whole chat between the athlete and a coach (marked as receiver)

- **sendMessage** method is used to send a message to a coach (marked as receiver)

CoachActions
-------------

CoachActions class is responsible for the actions of the coaches. Everything a coach can do 
in our service happens inside CoachActions.

- **The constractor** asigns the objects a (ArrayList<Athletes>), c (Coach), n (int) to the instance variables athletesarray, coach, numberOfAthletes respectively

- **showProfile** method is used to show the whole profile of the coach\

- **descending(____)Filter** methods are used to print all athletes based on a descending (____) filter

- **ascending(____)Filter** methods are used to print all athletes based on an ascending (____) filter

- **showAthletes** method is used to show groups of 10 athletes. The default filter is descending like filter but the coach can change that.
After seeing the athletes the coach is asked whether or not they are interested in reaching out to any of these athletes. If the answer is YES then they open a chat and send a message if the answer is NO they can see the next 10 athletes... and the loop continues.

- **showBasicProfile** method is used to show the basic data of the chosen athlete

- **showAllProfile** method is used to show all data of the chosen athlete

- **seeWholeConversation** method is used to print the whole conversation between the coach and an athlete (marked as receiver)

- **sendNewMessage** method is used to send a new message to a chosen athlete (marked as receiver)
