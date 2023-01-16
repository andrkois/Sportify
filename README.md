# Sportify
This is a social media app. We created this app for a university project.

##1o bullet

##2o bullet

##Instructions for use:
When running the code the user is faced with the question of whether they like to log in or register.
The **register** option is used to create a new account for a coach or an athlete who sets a **unique** username and a password for them in order to **log-in** the next time they use our app.
**Log-in** option can be used when a user already has an account and wants to enter our app.
Based on the type of user (Coach/ Athlete) the rest of the application is different.
#####Menu of a coach:
After logging in as a coach the following menu appears on the screen: ***Type : 1 to edit your profile 2. to view it 3. to search for athletes 4. to see a Chat 5. to send a message 6. to logout***
1: The coach can edit everything regarding their profile 
2: The coach can view their complete profile 
3: The coach can search for athletes (This also gives them the opportunity to see the top players based on likes etc) 
4: The coach can see an already open chat between them and an athlete 
5: The coach can open a chat and send a message to an athlete or send a message to an already open chat. 
6: The coach logs out. After logging out everything is saved.
#####Menu of an athlete:
After logging in as an athlete the following menu appears on the screen: ***Type : 1. to edit your profile 2. to view your profile 3. to see a Chat 4. to send a message 5. to log out***
1: The athlete can edit everything regarding their profile 
2: The athlete can view their complete profile 
3: The athlete can see an already open chat between them and a coach 
4: The athlete can send a message to an already open chat between them and a coach 
5: The athlete logs out. After logging out everything is saved.


##Structure of git repository

The structure of our git repository contains the default branch named ***main***, the ***Serialize*** branch, and the ***MAIN-FINAL*** branch.

The default branch ***main*** consists of all the final classes ready to be used by the users. Except for the .java files, it also includes 3 byte files (***UserInfo.ser, AthleteInfo.ser, CoachInfo.ser***). The last three files contain all of the data generated by the program. The branch also has the ***README.md*** file.

The ***Serialize*** branch was created in order for the program to be able to run for the first time. In particular, the **Main.java** file creates the *.ser* files and stores some sample values. The *.ser* files were then transferred into the ***main*** branch so that the **Main.java** can deserialize them and execute them. This branch is not used during the execution of the app.

In the beginning, the different operations were assigned to two-person teams and each team had its own branch. For instance, there was a ***Chat*** branch. After the codes were finished, all *.java* files were transferred into the ***MAIN-FINAL*** branch and then were deleted for illustrating purposes.

The ***MAIN-FINAL*** branch was the testing branch in which everyone committed their code and updated the classes.


##5o bullet

##Data structure and algorithms used by the application

The storing of our data happens in *.ser* files. More specifically, we created 3 array lists (*usersarray*, *coachesarray*, *athletesarray*) that contain the objects of each *User*, *Coach*, *Athlete* in the corresponding order. In the begging of the program, the array lists are deserialized (converted from bytes to objects) and are now ready to be used by the program without any needed connection with another database. At the end of the program execution, the updated by the users array lists are serialized, overriding the previous ones and being converted into bytes.
Inside *coachesarray* and *athletesarray* there is another ArrayList called *messages*. This *messages* ArrayList is an instance variable of type Users, which is inherited by the Athletes and Coaches objects. It consists of many ArrayLists, each one representing a chat of the user with someone. These ArrayLists also consist of ArrayLists, with the latter representing a message and their sender. In this way, all messages can be saved. It must be noted that the **first** ArrayList inside the ArrayLists that represent a chat consists of only a String, the username of the contact.

