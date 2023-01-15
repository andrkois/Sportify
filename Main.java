import java.util.ArrayList;
import java.io.*;

public class Main {               
    public static void main(String[] args) throws IOException {

        
            ArrayList<Users> usersarray = new ArrayList<Users>();
            ArrayList<Athletes> athletesarray = new ArrayList<Athletes>();
            ArrayList<Coaches> coachesarray = new ArrayList<Coaches>();

        try {
            
            //user
            FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            String username = "Kon18user";
            String password = "123";
            String choice = "Athlete";
            Users user = new Users(username, password, choice);
            usersarray.add(user);
            username = "Dionuser";
            password = "1234";
            choice = "Coach";
            user = new Users(username, password, choice);
            usersarray.add(user);
            out.writeObject(usersarray);
            out.close();
            fileOut.close();
            //athlete
            FileOutputStream fileOut1 = new FileOutputStream("AthleteInfo.ser");
            ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
            
            username = "Kon18user";
            Athletes athlete = new Athletes(username,password, choice );
            athletesarray.add(athlete);
            out1.writeObject(athletesarray);
            out1.close();
            fileOut1.close();
            //coach
            FileOutputStream fileOut2 = new FileOutputStream("CoachInfo.ser");
            ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);

            username = "Dionuser";
            Coaches coach = new Coaches(username,password,choice);
            coachesarray.add(coach);
            out2.writeObject(coachesarray);
            out2.close();
            fileOut2.close();
            /*for (Users a : usersarray) {
                System.out.println(a.username);
            }
            for (Athletes k : athletesarray) {
                System.out.println(k.username);
            }
            for (Coaches P : coachesarray) {
                System.out.println(P.username);
            }*/
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        //usersarray = null;
        /*try
        {
            FileInputStream fis = new FileInputStream("UserInfo2.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
 
            usersarray = (ArrayList<Users>)ois.readObject();
 
            ois.close();
            fis.close();
            System.out.println("123");
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
        }*/
        
    }
}
