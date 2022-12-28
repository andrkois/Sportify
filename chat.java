import java.util.ArrayList;
import java.util.Scanner;

public class Chat {

	public void openChat(User name) {
        // Here Messages is an ArrayList of ArrayLists
        ArrayList<ArrayList<String> > chat =
                  new ArrayList<ArrayList<String> >();

        ArrayList<String> userName = new ArrayList<String>();
        userName.add(name.getName());
        chat.add(userName);
	}

	// This method checks if there is already an open chat or opens a chat if called by a coach
	public boolean checkChat(User receiver, User sender, ArrayList<ArrayList<ArrayList<String> > > msgSender) {

		int n = -10;
		for (int i = 0; i < msgSender.size(); i++) {
	    	if (msgSender.get(i).get(1).get(1) == receiver.getName()) {
				n = i;
	           	break;
			}
		}

		boolean flag = false;
		if (n == -10) {
			if (sender instanceof Coach) { //Only a coach can open a chat
				openChat(receiver);
				openChat(sender);
				flag = true;
				System.out.println("The chat just opened");
			} else {
				// Chat not found error
				System.err.println("Only a coach can open a chat");
			}
		} else {
			flag = true;
		}
		return flag;
	}

	// This method prints the whole conversation
	public void seeConversation(ArrayList< ArrayList< ArrayList<String> > > msgSender, User receiver) {
		int n = -10;
		for (int i = 0; i < msgSender.size(); i++) {
			if (msgSender.get(i).get(1).get(1) == receiver.getName()) {
				n = i;
		      	break;
			}
		}

		for (int i = 0; i < msgSender.get(n).size(); i++) {
			for (String str : msgSender.get(n).get(i)) {
				System.out.println(str);
			}
		}
	}

	// This method is used to send and save a new message
	public void sendMessage(User receiver, User sender, ArrayList<ArrayList<ArrayList<String> > > msgSender,
		ArrayList<ArrayList<ArrayList<String> > > msgReceiver, boolean flag) {

		if (flag == true) {
			Scanner inputMsg = new Scanner(System.in);
			// Message input
			System.out.println("Write your message and press enter to send:");
			String msg = inputMsg.nextLine();
			// Save sender and message
			ArrayList<String> message = new ArrayList<String>();
			message.add(sender.getName());
			message.add(msg);
			//chat.add(message);
			int n = -10;
			for (int i = 0; i < msgSender.size(); i++) {
				if (msgSender.get(i).get(1).get(1) == receiver.getName()) {
					n = i;
				  	break;
				}
			}
			msgSender.get(n).add(message);
			//Same for the receiver
			int r = -10;
			for (int i = 0; i < msgReceiver.size(); i++) {
				if (msgSender.get(i).get(1).get(1) == sender.getName()) {
					r = i;
				  	break;
				}
			}
			msgReceiver.get(r).add(message);

		} else {
			System.err.println("A chat must be opened by a coach");
		}
	}
}

