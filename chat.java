import java.util.*;
import java.util.Scanner;

public class Chat {
	public void openChat(User name) {
        // Here Messages is an ArrayList of ArrayLists
        ArrayList<ArrayList<String> > Messages =
                  new ArrayList<ArrayList<String> >();

        ArrayList<Integer> interlocutor = new ArrayList<Integer>();
        interlocutor.add(name.getName());
        Messages.add(interlocutor);
	}

	// This method checks if there is already an open chat
	public boolean checkChat(User receiver, User sender, ArrayList<ArrayList<String> > Messages) {

		int n = 0;
		for (int i = 0; i < Messages.size(); i++){
	    	if (Messages.get(i) == receiver.getName()){
				n = i;
	           	break;
			}
		}

		flag = false;
		if (n = 0) {
			if (sender instanceof Coach) { //Only a coach can open a chat
				openChat(receiver);
				openChat(sender);
				flag = true;
			} else {
				// Chat not found error
				System.err.println("Chat not found");
			}
		} else {
			flag = true;
		}
		return flag;
	}

	// This method prints the whole conversation
	public void seeConversation(ArrayList<ArrayList<String> > Messages) {
		System.out.println(Messages);
	}

	// This method is used to send and save a new message
	public void sendMessage(User receiver, User sender, ArrayList<ArrayList<String> > Messages, boolean flag) {

		if (flag == true) {
			Scanner inputMsg = new Scanner(System.in);
			// Message input
			System.out.println("Write your message and press enter to send:"); // mporoume na to kanoume na anabosbhnei
			String msg = inputMsg.nextLine();
			// Save sender and message
			ArrayList<Integer> message = new ArrayList<Integer>();
			message.add(sender.getName());
			message.add(msg);
			Messages.add(message);
		} else {
			System.err.println("A chat must be opened by a coach");
		}
	}
}
