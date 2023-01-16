import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        try
        {
			//we created sample arraylists with Users, Athletes, Coaches objects to another project in order to serialize them
			//Now we start by deserialize them
			//inputs arraylist with Users type objects from file UserInfo.ser
            FileInputStream fis = new FileInputStream("UserInfo.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Users> usersarray = (ArrayList<Users>)ois.readObject();

            ois.close();
            fis.close();
			//inputs arraylist with Athletes type objects from file AthleteInfo.ser
            FileInputStream fisath = new FileInputStream("AthleteInfo.ser");
            ObjectInputStream oisath = new ObjectInputStream(fisath);

            ArrayList<Athletes> athletesearray = (ArrayList<Athletes>)oisath.readObject();

            oisath.close();
            fisath.close();
			
			//inputs arraylist with Coaches type objects from file CoachInfo.ser
            FileInputStream fiscoa = new FileInputStream("CoachInfo.ser");
            ObjectInputStream oiscoa = new ObjectInputStream(fiscoa);

            ArrayList<Coaches> coachesarray = (ArrayList<Coaches>)oiscoa.readObject();

            oiscoa.close();
            fiscoa.close();


           boolean flaglg=false;
		   //the user choses to either register or log in
System.out.println("Do you want to register or log in?");
System.out.println("press 1 to register or 2 to log in");
int logorreg=7;
Scanner Obj = new Scanner(System.in);
do{
    try{
logorreg = Obj.nextInt();
if (logorreg == 1 || logorreg==2){
    break;
}
System.out.println("Invalid... Press 1 or 2");
    }
    catch (InputMismatchException e) {
       System.out.println("Invalid... Press enter a number 1 or 2");
	   Obj.nextLine();
            }

} while (logorreg != 1 && logorreg!=2);
if (logorreg==1){

boolean flag=true;
System.out.println("Enter username");
//the user enters a username
Scanner myObj = new Scanner(System.in);
String username1="a";
while (flag==true){
username1 = myObj.nextLine(); // Read user input
for (Users q : usersarray){
    if (q.getUsername().equals(username1)){
        flag=true;
        System.out.println("This username already exists. Enter another username");
        break;
    } else{
        flag= false;
    }
}
}

System.out.println("Enter Password");
Scanner objpass = new Scanner(System.in);
//the user enters a password
String password = objpass.nextLine();
System.out.println("Are you an athlete or a coach?/n Write athlete for athlete or coach for coach");
String choice;
do{
Scanner objchoice = new Scanner(System.in);
//the user enters if they are an athlete or a coach
choice = objchoice.nextLine();
if (choice.equals("athlete") || choice.equals("coach")){
    break;
}
System.out.println("Invalid... Write athlete or coach");
} while (choice!="athlete" && choice!="coach");
Users user = new Users(username1, password, choice) ;
usersarray.add(user);
Scanner input1 = new Scanner(System.in);
//for athletes
String usernameuser;
if (choice.equals("athlete")){
    Athletes athlete = new Athletes(username1,password,choice);
    athletesearray.add(athlete);
    AthletesActions athleteact = new AthletesActions(athlete);
    int i=1;
	do {
		System.out.println();
		//the menu of the application for athletes
        System.out.println("Type \n1 to edit your profile \n2 to view your profile \n3 to see a Chat \n4 to send a message \n5 to log out");
		System.out.println();
		Scanner sc = new Scanner(System.in);
        boolean flag1;
		boolean loop=false;
        do{
			try{
		 i = sc.nextInt();
         if(i==1 || i==2 || i==3 || i==4 || i==5){
			loop=true;
         }
		 if(loop==false){
         System.out.println("Invalid. Type : \n1 to edit your profile \n2 to view it \n3 to see a Chat \n4 to send a message \n5 to log out");
		 }
		} catch(InputMismatchException e){
			System.out.println("You must enter a number.Type : \n1 to edit your profile \n2 to view your profile \n3 to see a Chat \n4 to send a message \n5 to log out");
			System.out.println();
		sc.nextLine();
		}
   		}while(loop==false);
		   athlete.edit(1, "Default");
		   athlete.edit(3, "Default");
		   athlete.edit(4, "Default");
		   athlete.edit(5, "Default");
		   athlete.edit(6, "Default");
		   athlete.edit(7,0.0);
		   athlete.edit(8,0.0);
		   athlete.edit(2,0);
		if (i == 1) { 
			//the athletes choose what to change from their profile 
			System.out.println("What do you want to change? 1:name, 2:age, 3:sport, 4:bio, 5:position, 6:current_team, 7:height, 8:weight");
			Scanner sc1 = new Scanner(System.in);
            int num=0;
			boolean loop2=false;
            do{
				try{
			 num = sc1.nextInt();
             if(num==1 || num==2 || num==3 || num==4||num==5 || num==6 || num==7 || num==8 ){
				loop2=true;
             }
			 if(loop2==false){
             System.out.println("Invalid. Pick 1:name, 2:age, 3:sport, 4:bio, 5:position, 6:current_team, 7:height, 8:weight");
			 }
			} catch(InputMismatchException e){
				System.out.println("You must enter a number. Pick 1:name, 2:age, 3:sport, 4:bio, 5:position, 6:current_team, 7:height, 8:weight");
				sc1.nextLine();
			}
            }while(loop2==false);
			
			if (num == 1 || num == 3 || num == 4 || num ==5 || num == 6) {
				System.out.println("insert the new value");
				Scanner sc2 = new Scanner(System.in);
    			String s = sc2.nextLine();
    			athlete.edit(num, s);
			}
    		else if ( num == 7 || num == 8 ) {
				System.out.println("insert the new value");
				Scanner sc3 = new Scanner(System.in);
				boolean continueLoop = true;
				do{
				try {
					double d = sc3.nextDouble();
					continueLoop = false;
					athlete.edit(num, d);
				} catch(InputMismatchException e){
					System.out.println("Please enter a number :");
					sc3.nextLine();
				}
				} while(continueLoop);
			} else if (num == 2){
				System.out.println("insert the new value");
				Scanner sc4 = new Scanner(System.in);
				boolean continueLoop2 = true;
				do{
					try {
					    int integ = sc4.nextInt();
						continueLoop2 = false;
						athlete.edit(num, integ);
					} catch (InputMismatchException e) {
					  System.out.println("Please enter a number :");
					  sc4.nextLine();
					}
				}while(continueLoop2);
		
			}
		} else if (i == 2){ //the whole profile is displayed
			athleteact.showProfile();
        } else if (i==3) { //the athlete chose to see a chat with a coach
         input1 = new Scanner(System.in);

		System.out.println("With whom? Enter username");
		//the athlete enters the username of the coach
		usernameuser = input1.nextLine();
		 flag1 = false;

		do {
			for (Coaches c: coachesarray) {
				if (c.getUsername().equals(usernameuser)) {
					flag1 = true;
                    athleteact.seeWholeConversation(c);
					break;
				}

			}
			if(flag1 == false) {
				System.out.println("There is no coach with this username, write one of the usernames below:");
				for (Coaches b: coachesarray) {
					System.out.println(b.getUsername()); //all the usernames are being displayed so that a coach can be chosen
				}
				System.out.println("Enter Username");
				usernameuser = input1.nextLine();
			}
		} while (flag1==false);
        } else if (i==4) { //the athlete chose to send a message
            System.out.println("To who? Enter username"); 
			//the athlete enters the username of the coach
		    usernameuser = input1.nextLine();
		     flag1 = false;

             do {
		    	for (Coaches c: coachesarray) {
			    	if (c.getUsername().equals(usernameuser )) {
					flag1 = true;
                    athleteact.sendNewMessage(c);
					break;
				}

			}
			if(flag1== false) {
				System.out.println("There is no coach with this username, write one of the usernames below:"); 
				    //all the usernames are being displayed so that a coach can be chosen
					for (Coaches c: coachesarray) {
					System.out.println(c.getUsername());
				}
				System.out.println("Enter Username");
				usernameuser= input1.nextLine();
			}
		} while (flag1==false);

        } else {
			System.out.println("You logged out successfully.");
			flaglg=true;
		}
	}while( i != 5);
} else { //for coach
	//object creations and addition to arraylist
    Coaches coach = new Coaches(username1,password,choice);
    coachesarray.add(coach);
    CoachActions coachact = new CoachActions(athletesearray, coach,athletesearray.size());
	int i=0;
	do{
		System.out.println();
		//the menu of the application
        System.out.println("Type \n1 to edit your profile \n2 to view it \n3 to search for athletes \n4 to see a Chat \n5 to send a message \n6 to log out");
		Scanner sc4 = new Scanner(System.in);

        do{
			try{
		i = sc4.nextInt();
        if(i==1 || i==2 || i==3 || i==4 || i==5 || i==6){
            break;
         } 
         System.out.println("Invalid. Type \n1 to edit your profile \n2 to view it \n3 to search for athletes \n4 to see a Chat \n5 to send a message \n6 to logout");
			}catch ( InputMismatchException e) {
				System.out.println("You must enter a number. Type \n1 to edit your profile \n2 to view it \n3 to search for athletes \n4 to see a Chat \n5 to send a message \n6 to logout");
				sc4.nextLine();
			}
		}while(i!=1 && i!=2 && i!=3 && i!=4 && i!=5 && i!= 6); 
		//loops until it receives a proper input 
		if (i == 1) {
			//the coaches choose what to change from their profile 
			System.out.println("What do you want to change? 1:name, 2:age, 3:sport, 4:bio, 5:years_of_experience, 6:team");
			Scanner sc5 = new Scanner(System.in);
            int num=0;
            do{
				try{
			num = sc5.nextInt();
            if(num==1 || num==2 || num==3 || num==4 || num==5 || num== 6){
                break;
            }
            System.out.println("Invalid. 1:name, 2:age, 3:sport, 4:bio, 5:years_of_experience, 6:team ");
		}catch ( InputMismatchException e) {
			System.out.println("You must enter a number. 1:name, 2:age, 3:sport, 4:bio, 5:years_of_experience, 6:team ");
				sc5.nextLine();}
		}while(num!=1 && num!=2 && num !=3 && num !=4 && num !=5 &&num !=6);
			if (num == 2 || num == 5 ) {
				System.out.println("insert the new value");
				Scanner sc6 = new Scanner(System.in);
				boolean continueLoop3 = true;
				do{
					try {
						int y = sc6.nextInt();
						coach.edit(num, y);
						continueLoop3 = false;
					} catch(InputMismatchException e){
						System.out.println("Please enter a number :");
					    sc6.nextLine();
					}
			} while(continueLoop3);
		}else if (num == 1 || num == 3 || num == 4 || num == 6) {
				System.out.println("insert the new value");
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				coach.edit(num, s);
			}
		} else if (i == 2){
			coachact.showProfile();//Do 
        }

        else if (i==3) {

		coachact.showAthletes();
        } else if(i==4) {
	     input1 = new Scanner(System.in);
		System.out.println("With whom? Enter username");
		usernameuser = input1.nextLine();
		 flag = false;

		do {
			for (Athletes a: athletesearray) {
				if (a.getUsername().equals(usernameuser)) {
					flag = true;
                    coachact.seeWholeConversation(a);
					break;
				}

			}
			if(flag == false) {
				System.out.println("There is no athlete with this username, write one of the usernames below:");
				for (Athletes b: athletesearray) {
					System.out.println(b.getUsername());
				}
				System.out.println("Enter Username");
				usernameuser= input1.nextLine();
			}
		} while (flag==false);
    } else if (i ==5) {

        System.out.println("To who? Enter username");
		usernameuser = input1.nextLine();
		boolean flag1 = false;

		do {
			for (Athletes a: athletesearray) {
				if (a.getUsername().equals(usernameuser)) {
					flag1 = true;
                    coachact.sendNewMessage(a);
					break;
				}

			}
			if(flag1 == false) {
				System.out.println("There is no athlete with this username, write one of the usernames below:");
				for (Athletes b: athletesearray) {
					System.out.println(b.getUsername());
				}
				System.out.println("Enter Username");
				usernameuser= input1.nextLine();
			}
		} while (flag1==false);
    } else {
		System.out.println("You logged out successfully.");
		flaglg=true;
	}
   }while(i!=6);

}
//LOG IN
} else {
System.out.println("Enter username");
Scanner myObj = new Scanner(System.in);
String username1 = myObj.nextLine();
System.out.println("Enter Password");
String password1= myObj.nextLine();
boolean flag=true;
Users x = usersarray.get(0); //initializing x so that it can be used in lines 313 and 320
while (flag==true){
for (Users q : usersarray){
    if (q.getUsername().equals(username1) && q.getPassword().equals(password1)){
        flag=false;
        System.out.println("You logged in successfully.");
       x = q;

        break;
    }
}
if (flag==true) {
    System.out.println("This username does not exist or password is incorrect. Try again...Insert Username");
    username1 = myObj.nextLine();
    System.out.println("Enter Password");
    password1= myObj.nextLine();
}
}

Athletes athlete =  athletesearray.get(0);
int identity = 0;
String usernametemp=x.getUsername();
for (Athletes ac : athletesearray) {
    if (usernametemp.equals(ac.getUsername())) {
        identity = 1;
        athlete = ac;
    }
}

Coaches coach = coachesarray.get(0);
for (Coaches xc : coachesarray) {
    if (usernametemp.equals(xc.getUsername())) {
        identity = 2;
        coach=xc;

    }
}





Scanner input1 = new Scanner(System.in);
//for athletes
String usernameuser;
if (identity == 1) {

    AthletesActions athleteact = new AthletesActions(athlete);
    int i=1;
	do {
	    System.out.println();
		//the menu of the application 
        System.out.println("Type \n1 to edit your profile \n2 to view it \n3 to see a Chat \n4 to send a message \n5 to log out");
		Scanner sc = new Scanner(System.in);
        boolean flag1;
        do {
			try{
		 i = sc.nextInt();
         if(i==1 || i==2 || i==3 || i==4 || i==5) {
            break;
         }
         System.out.println("Invalid. Type \n1 to edit your profile \n2 to view it \n3 to see a Chat \n4 to send a message \n5 to log out");
		} catch ( InputMismatchException e) {
			System.out.println("You must enter a number. Type \n1 to edit your profile \n2 to view it \n3 to see a Chat \n4 to send a message \n5 to log out");
		sc.nextLine();
		}
		}while(i!=1 && i!=2 && i!=3 && i!=4 && i!=5  );
		if (i == 1) {
			//the athletes choose what to change from their profile
			System.out.println("What do you want to change? 1:name, 2:age, 3:sport, 4:bio, 5:position, 6:current_team, 7:height, 8:weight");
			Scanner sc1 = new Scanner(System.in);
            int num=0;
            do {
				try {
			 num = sc1.nextInt();
             if(num==1 || num==2 || num==3 || num==4||num==5 || num==6 || num==7 || num==8 ) {
                break;
             }
             System.out.println("Invalid. Pick 1:name, 2:age, 3:sport, 4:bio, 5:position, 6:current_team, 7:height, 8:weight");
			} catch ( InputMismatchException e) {
				System.out.println("You must enter a number. Pick 1:name, 2:age, 3:sport, 4:bio, 5:position, 6:current_team, 7:height, 8:weight");
				sc1.nextLine();
			}
            }while(num!=1 && num!=2 && num!=3 && num!=4 && num!=5 && num!=6 && num!=7 && num!=8 );
			if (num == 1 || num == 3 || num == 4 || num ==5 || num == 6) {
				System.out.println("insert the new value");
				Scanner sc2 = new Scanner(System.in);
    			String s = sc2.nextLine();
    			athlete.edit(num, s);
			}
    		else if ( num == 7 || num == 8 ) {
				System.out.println("insert the new value");
				Scanner sc3 = new Scanner(System.in);
				boolean continueLoop = true;
				do{
				try {
					double d = sc3.nextDouble();
					continueLoop = false;
					athlete.edit(num, d);
				} catch(InputMismatchException e){
					System.out.println("Please enter a number :");
					sc3.nextLine();
				}
				} while(continueLoop);
			} else if (num == 2) {
				System.out.println("insert the new value");
				Scanner sc4 = new Scanner(System.in);
				boolean continueLoop2 = true;
				do{
					try {
					    int integ = sc4.nextInt();
						continueLoop2 = false;
						athlete.edit(num, integ);
					} catch (InputMismatchException e) {
					  System.out.println("Please enter a number :");
					  sc4.nextLine();
					}
				}while(continueLoop2);
			}
		} else if (i == 2) {
			athleteact.showProfile();
        } else if (i==3) {
         input1 = new Scanner(System.in);

		System.out.println("With whom? Enter username");
		usernameuser = input1.nextLine();
		 flag1 = false;

		do {
			for (Coaches c: coachesarray) {
				if (c.getUsername().equals(usernameuser)) {
					flag1 = true;
                    athleteact.seeWholeConversation(c);
					break;
				}

			}
			if(flag1 == false) {
				System.out.println("There is no coach with this username, write one of the usernames below:");
				for (Coaches b: coachesarray) {
					System.out.println(b.getUsername());
				}
				System.out.println("Enter Username");
				usernameuser = input1.nextLine();
			}
		} while (flag1==false);
        } else if (i == 4) {
            System.out.println("To who? Enter username");
		    usernameuser = input1.nextLine();
		     flag1 = false;

             do {
		    	for (Coaches c: coachesarray) {
			    	if (c.getUsername().equals(usernameuser )) {
					flag1 = true;
                    athleteact.sendNewMessage(c);
					break;
				}

			}
			if(flag1== false) {
				System.out.println("There is no coach with this username, write one of the usernames below:");
				for (Coaches b: coachesarray) {
					System.out.println(b.getUsername());
				}
				System.out.println("Enter Username");
				usernameuser= input1.nextLine();
			}
		} while (flag1==false);

        } else {
			System.out.println("You logged out successfully.");
			flaglg=true;
		}
	}while(i!=5);

} else { //for coach

    CoachActions coachact = new CoachActions(athletesearray, coach,athletesearray.size());
	int i=0;
	do{
		System.out.println();
		//the menu of the application
        System.out.println("Type \n1 to edit your profile \n2 to view it \n3 to search for athletes \n4 to see a Chat \n5 to send a message \n6 to logout");
		Scanner sc4 = new Scanner(System.in);


        do{
			try{
		i = sc4.nextInt();
        if(i==1 || i==2 || i==3 || i==4 || i==5 || i == 6){
            break;
         }
         System.out.println("Invalid. Type \n1 to edit your profile \n2 to view it \n3 to search for athletes \n4 to see a Chat \n5 to send a message \n6 to logout");
		} catch ( InputMismatchException e) {
			System.out.println("You must enter a number. Type \n1 to edit your profile \n2 to view it \n3 to search for athletes \n4 to see a Chat \n5 to send a message \n6 to logout");
			sc4.nextLine();
		}
		}while(i!=1 && i!=2 && i!=3 && i!=4 && i!=5 && i!=6);
		if (i == 1) {
			System.out.println("What do you want to change? 1:name, 2:age, 3:sport, 4:bio, 5:years_of_experience, 6:team");
			Scanner sc5 = new Scanner(System.in);
            int num=0;
            do{
				try{
			num = sc5.nextInt();
            if(num==1 || num==2||num==3 || num==4 || num==5 || num== 6) {
                break;
            }
            System.out.println("Invalid. 1:name, 2:age, 3:sport, 4:bio, 5:years_of_experience, 6:team ");
		} catch ( InputMismatchException e) {
			System.out.println("You must enter a number. 1:name, 2:age, 3:sport, 4:bio, 5:years_of_experience, 6:team ");
			sc5.nextLine();
		}
            }while(num!=1 && num!=2 && num !=3 && num !=4 && num !=5 &&num !=6);
			if (num == 2 || num == 5 ) {
				System.out.println("insert the new value");
				Scanner sc6 = new Scanner(System.in);
				boolean continueLoop4 = true;
				do{
					try {
						int y = sc6.nextInt();
						coach.edit(num, y);
						continueLoop4 = false;
					} catch(InputMismatchException e){
						System.out.println("Please enter a number :");
					    sc6.nextLine();
					}
			} while(continueLoop4);
			}
    		else if (num == 1 || num == 3 || num == 4 || num == 6) {
				System.out.println("insert the new value");
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				coach.edit(num, s);
			}
		} else if (i == 2) {
			coachact.showProfile();
        }

        else if (i==3) {
  
		coachact.showAthletes();
        } else if(i==4) {
	     input1 = new Scanner(System.in);
		System.out.println("With whom? Enter username");
		usernameuser = input1.nextLine();
		 flag = false;

		do {
			for (Athletes a: athletesearray) {
				if (a.getUsername().equals(usernameuser)) {
					flag = true;
                    coachact.seeWholeConversation(a);
					break;
				}

			}
			if(flag == false) {
				System.out.println("There is no athlete with this username, write one of the usernames below:");
				for (Athletes b: athletesearray) {
					System.out.println(b.getUsername());
				}
				System.out.println("Enter Username");
				usernameuser= input1.nextLine();
			}
		} while (flag==false);
    } else if (i == 5) {

        System.out.println("To who? Enter username");
		usernameuser = input1.nextLine();
		boolean flag1 = false;

		do {
			for (Athletes a: athletesearray) {
				if (a.getUsername().equals(usernameuser)) {
					flag1 = true;
                    coachact.sendNewMessage(a);
					break;
				}

			}
			if(flag1 == false) {
				System.out.println("There is no athlete with this username, write one of the usernames below:");
				for (Athletes b: athletesearray) {
					System.out.println(b.getUsername());
				}
				System.out.println("Enter Username");
				usernameuser= input1.nextLine();
			}
		} while (flag1==false);
    } else {
		System.out.println("You logged out successfully.");
		flaglg=true;
	}
		}while(i!=6);




}


}

        FileOutputStream fos = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(usersarray);
        oos.close();
        fos.close();
        FileOutputStream fosath = new FileOutputStream("AthleteInfo.ser");
        ObjectOutputStream oosath = new ObjectOutputStream(fosath);
        oosath.writeObject(athletesearray);
        oosath.close();
        fosath.close();
        FileOutputStream foscoa = new FileOutputStream("CoachInfo.ser");
        ObjectOutputStream ooscoa = new ObjectOutputStream(foscoa);
        ooscoa.writeObject(coachesarray);
        ooscoa.close();
        foscoa.close();

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
    }
}
