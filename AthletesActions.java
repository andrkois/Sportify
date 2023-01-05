
    import java.util.Scanner;
	

public class AthletesActions {
    
	private Athletes athlete;
	public AthletesActions(Athletes a) {
		athlete = a;
	}

	public void showProfile() {
			System.out.println("Name: " + athlete.getName()+" Age: " +athlete.getAge()+" Sport: "+ athlete.getSport()+ " Position: " +athlete.getPosition()+ " Current Team: " + athlete.getCurrent_team()+
			" Height: "+athlete.getHeight()+" Weight: "+ athlete.getWeight()+" Likes: "+ athlete.getLikes()+" Bio: "+athlete.getBio());

	}


	public void seeWholeConversation(Users receiver) {
			Chat.seeConversation(athlete.getMessages(), receiver);
			System.out.println("Do you want to send a new message? Type 1 for YES 2 for NO");
			Scanner in = new Scanner(System.in);
			int reachout = in.nextInt();
			if (reachout == 1) {
				Chat.sendMessage(receiver,athlete, Chat.checkChat(receiver, athlete));
			}
		}

		public void sendNewMessage(Users receiver) {
			Chat.sendMessage(receiver,athlete, Chat.checkChat(receiver, athlete));
	}


}

