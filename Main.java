import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
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


            
            /*for(Users a : usersarray){
                System.out.println(a.name);
            }
            for (Athletes k : athletesearray) {
                System.out.println(k.username);
            }
            for (Coaches P : coachesarray) {
                System.out.println(P.username);
            }
            System.out.println("success");*/
System.out.println("Do you want to register or log in?");
System.out.println("press 1 to register or 2 to log in");
Scanner Obj = new Scanner(System.in);
int logorreg = Obj.nextInt();
if (logorreg==1){

boolean flag=true;
System.out.println("Enter username");
Scanner myObj = new Scanner(System.in);
String username1="a";
while (flag==true){
username1 = myObj.nextLine(); // Read user input
for (Users q : usersarray){
    if (q.username.equals(username1)){
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
String password = objpass.nextLine();
System.out.println("Enter name");
Scanner objname = new Scanner(System.in);
String name = objname.nextLine();
System.out.println("Are you an athlete or a coach?/n Write athlete for athlete or coach for coach");
// develop a check condition
Scanner objchoice = new Scanner(System.in);
name = objchoice.nextLine();
usersarray.add(new Users(username1, password, name));


if (name.equals("athlete")){
    athletesearray.add(new Athletes(username1));
} else {
    coachesarray.add(new Coaches(username1));
}


} else {//we have to develop a check condition
System.out.println("Enter username");
Scanner myObj = new Scanner(System.in);
String username1 = myObj.nextLine();
System.out.println("Enter Password");
String password1= myObj.nextLine();
boolean flag=true;
while (flag==true){
for (Users q : usersarray){
    if (q.username.equals(username1) && q.password.equals(password1)){
        flag=false;
        System.out.println("You logged in successfully");
        break;
    }
}
if (flag==true){
    System.out.println("This username does not exist or password is incorrect. Try again...");
    username1 = myObj.nextLine();
    System.out.println("Enter Password");
    password1= myObj.nextLine();
}
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


        /*try
        {
            FileOutputStream fos = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(usersarray);
            oos.close();
            fos.close();
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }*/
     
    }
    //}
}
