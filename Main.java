import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) throws IOException {

        try
        {
            FileInputStream fis = new FileInputStream("UserInfo.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Users> usersarray = (ArrayList<Users>)ois.readObject();

            ois.close();
            fis.close();
            FileInputStream fisath = new FileInputStream("AthleteInfo.ser");
            ObjectInputStream oisath = new ObjectInputStream(fisath);

            ArrayList<Athletes> athletesearray = (ArrayList<Athletes>)oisath.readObject();

            oisath.close();
            fisath.close();

            FileInputStream fiscoa = new FileInputStream("CoachInfo.ser");
            ObjectInputStream oiscoa = new ObjectInputStream(fiscoa);

            ArrayList<Coaches> coachesarray = (ArrayList<Coaches>)oiscoa.readObject();

            oiscoa.close();
            fiscoa.close();


           boolean flaglg=false;
System.out.println("Do you want to register or log in?");
System.out.println("press 1 to register or 2 to log in");
int logorreg=7;
do{
    try{
Scanner Obj = new Scanner(System.in);
logorreg = Obj.nextInt();
if (logorreg == 1 || logorreg==2){
    break;
}
    }
    catch (InputMismatchException ex) {
        System.out.println(ex);
            }
System.out.println("Wrong ...Press 1 or 2");
} while (logorreg != 1 && logorreg!=2);
if (logorreg==1){

boolean flag=true;
System.out.println("Enter username");
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
//Have to create try catch input mismatch
System.out.println("Enter Password");
Scanner objpass = new Scanner(System.in);
String password = objpass.nextLine();
/*System.out.println("Enter name");
Scanner objname = new Scanner(System.in);
String name = objname.nextLine();*/
System.out.println("Are you an athlete or a coach?/n Write athlete for athlete or coach for coach");
String choice;
do{
Scanner objchoice = new Scanner(System.in);
choice = objchoice.nextLine();
if (choice.equals("athlete") || choice.equals("coach")){
    break;
}
System.out.println("Wrong... Write athlete or coach");
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
        System.out.println("Type \n1 to edit your profile \n2 to view it \n3 to see a Chat \n4 to send a message \n5 to log out");
		Scanner sc = new Scanner(System.in);
        boolean flag1;
        do{
		 i = sc.nextInt();
         if(i==1 || i==2 || i==3 || i==4 || i==5){
            break;
         }
         System.out.println("Wrong. Type \n1 to edit your profile \n2 to view it \n3 to see a Chat \n4 to send a message \n5 to log out");
    }while(i!=1 && i!=2 && i!=3 && i!=4 && i!=5);
		if (i == 1) {
			System.out.println("What do you want to change? 1:name, 2:age, 3:sport, 4:bio, 5:position, 6:current_team, 7:height, 8:weight");
			Scanner sc1 = new Scanner(System.in);
            int num=0;
            do{
			 num = sc1.nextInt();
             if(num==1 || num==2 || num==3 || num==4||num==5 || num==6 || num==7 || num==8 ){
                break;
             }
             System.out.println("Wrong. Pick 1:name, 2:age, 3:sport, 4:bio, 5:position, 6:current_team, 7:height, 8:weight");
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
				double d = sc3.nextDouble();
				athlete.edit(num, d);
			} else if (num == 2){
				System.out.println("insert the new value");
				Scanner sc4 = new Scanner(System.in);
				int integ = sc4.nextInt();
				athlete.edit(num, integ);
			}
		} else if (i == 2){
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
        } else if (i==4) {
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
	}while( i != 5);
} else { //for coach
    Coaches coach = new Coaches(username1,password,choice);
    coachesarray.add(coach);
    CoachActions coachact = new CoachActions(athletesearray, coach,athletesearray.size());
	int i=0;
	do{
		System.out.println();
        System.out.println("Type \n1 to edit your profile \n2 to view it \n3 to search for athletes \n4 to see a Chat \n5 to send a message \n6 to log out");
		Scanner sc4 = new Scanner(System.in);

        do{
		i = sc4.nextInt();
        if(i==1 || i==2 || i==3 || i==4 || i==5 || i==6){
            break;
         }
         System.out.println("Wrong. Type \n1 to edit your profile \n2 to view it \n3 to search for athletes \n4 to see a Chat \n5 to send a message \n6 to logout");
        }while(i!=1 && i!=2 && i!=3 && i!=4 && i!=5 && i!= 6);
		if (i == 1) {
			System.out.println("What do you want to change? 1:name, 2:age, 3:sport, 4:bio, 5:years_of_experience, 6:team");
			Scanner sc5 = new Scanner(System.in);
            int num=0;
            do{
			num = sc5.nextInt();
            if(num==1 || num==2||num==3 || num==4 || num==5 || num== 6){
                break;
            }
            System.out.println("Wrong. 1:name, 2:age, 3:sport, 4:bio, 5:years_of_experience, 6:team ");
            }while(num!=1 && num!=2 && num !=3 && num !=4 && num !=5 &&num !=6);
			if (num == 2 || num == 5 ) {
				System.out.println("insert the new value");
				Scanner sc6 = new Scanner(System.in);
    			int y = sc6.nextInt();
    			coach.edit(num, y);
			}
    		else if (num == 1 || num == 3 || num == 4 || num == 6) {
				System.out.println("insert the new value");
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				coach.edit(num, s);
			}
		} else if (i == 2){
			coachact.showProfile();
        }

        else if (i==3){

		coachact.showAthletes();
        }else if(i==4){
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
    }else if (i ==5){

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
} else {//we have to develop a check condition
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
if (flag==true){
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
    if (usernametemp.equals(ac.getUsername())){
        identity = 1;
        athlete = ac;
    }
}

Coaches coach = coachesarray.get(0);
for (Coaches xc : coachesarray) {
    if (usernametemp.equals(xc.getUsername())){
        identity = 2;
        coach=xc;

    }
}//////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





Scanner input1 = new Scanner(System.in);
//for athletes
String usernameuser;
if (identity == 1){

    AthletesActions athleteact = new AthletesActions(athlete);
    int i=1;
	do{
	    System.out.println();
        System.out.println("Type \n1 to edit your profile \n2 to view it \n3 to see a Chat \n4 to send a message \n5 to log out");
		Scanner sc = new Scanner(System.in);
        boolean flag1;
        do{
		 i = sc.nextInt();
         if(i==1 || i==2 || i==3 || i==4 || i==5){
            break;
         }
         System.out.println("Wrong. Type \n1 to edit your profile \n2 to view it \n3 to see a Chat \n4 to send a message \n5 to log out");
    }while(i!=1 && i!=2 && i!=3 && i!=4 && i!=5  );
		if (i == 1) {
			System.out.println("What do you want to change? 1:name, 2:age, 3:sport, 4:bio, 5:position, 6:current_team, 7:height, 8:weight");
			Scanner sc1 = new Scanner(System.in);
            int num=0;
            do{
			 num = sc1.nextInt();
             if(num==1 || num==2 || num==3 || num==4||num==5 || num==6 || num==7 || num==8 ){
                break;
             }
             System.out.println("Wrong. Pick 1:name, 2:age, 3:sport, 4:bio, 5:position, 6:current_team, 7:height, 8:weight");
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
				double d = sc3.nextDouble();
				athlete.edit(num, d);
			} else if (num == 2){
				System.out.println("insert the new value");
				Scanner sc4 = new Scanner(System.in);
				int integ = sc4.nextInt();
				athlete.edit(num, integ);
			}
		} else if (i == 2){
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

        }else {
			System.out.println("You logged out successfully.");
			flaglg=true;
		}
	}while(i!=5);

} else { //for coach

    CoachActions coachact = new CoachActions(athletesearray, coach,athletesearray.size());
	int i=0;
	do{
		System.out.println();
        System.out.println("Type \n1 to edit your profile \n2 to view it \n3 to search for athletes \n4 to see a Chat \n5 to send a message \n6 to logout");
		Scanner sc4 = new Scanner(System.in);


        do{
		i = sc4.nextInt();
        if(i==1 || i==2 || i==3 || i==4 || i==5 || i == 6){
            break;
         }
         System.out.println("Wrong. Type \n1 to edit your profile \n2 to view it \n3 to search for athletes \n4 to see a Chat \n5 to send a message \n6 to logout");
        }while(i!=1 && i!=2 && i!=3 && i!=4 && i!=5 && i!=6);
		if (i == 1) {
			System.out.println("What do you want to change? 1:name, 2:age, 3:sport, 4:bio, 5:years_of_experience, 6:team");
			Scanner sc5 = new Scanner(System.in);
            int num=0;
            do{
			num = sc5.nextInt();
            if(num==1 || num==2||num==3 || num==4 || num==5 || num== 6){
                break;
            }
            System.out.println("Wrong. 1:name, 2:age, 3:sport, 4:bio, 5:years_of_experience, 6:team ");
            }while(num!=1 && num!=2 && num !=3 && num !=4 && num !=5 &&num !=6);
			if (num == 2 || num == 5 ) {
				System.out.println("insert the new value");
				Scanner sc6 = new Scanner(System.in);
    			int y = sc6.nextInt();
    			coach.edit(num, y);
			}
    		else if (num == 1 || num == 3 || num == 4 || num == 6) {
				System.out.println("insert the new value");
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				coach.edit(num, s);
			}
		} else if (i == 2){
			coachact.showProfile();
        }

        else if (i==3){

		coachact.showAthletes();
        }else if(i==4){
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
    }else if (i == 5) {

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

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
