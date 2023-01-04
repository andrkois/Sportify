import java.util.ArrayList;
import java.util.Scanner;

public class Chat {

	public static void openChat(Users name, ArrayList<ArrayList<ArrayList<String>>> msg) {
        // Here Messages is an ArrayList of ArrayLists
        ArrayList<ArrayList<String> > chat =
                  new ArrayList<ArrayList<String> >();

        ArrayList<String> userName = new ArrayList<String>();
        userName.add(name.getUsername());
        chat.add(userName);
        msg.add(chat);
	}

	// This method checks if there is already an open chat or opens a chat if called by a coach
	public static boolean checkChat(Users receiver, Users sender) {

		int n = -10;
		for (int i = 0; i < sender.getMessages().size(); i++) {
	    	if (sender.getMessages().get(i).get(0).get(0).equals(receiver.getUsername())) {
				n = i;
	           	break;
			}
		}

		boolean flag = false;
		if (n == -10) {
			if (sender instanceof Coaches) { //Only a coach can open a chat
				openChat(receiver, sender.getMessages());
				openChat(sender, receiver.getMessages());
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
	public static void seeConversation(ArrayList< ArrayList< ArrayList<String> > > msgSender, Users receiver) {
		int n = -10;
		for (int i = 0; i < msgSender.size(); i++) {
			if (msgSender.get(i).get(0).get(0).equals(receiver.getUsername())) {
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
	public static void sendMessage(Users receiver, Users sender, boolean flag) {

		if (flag == true) {
			Scanner inputMsg = new Scanner(System.in);
			// Message input
			System.out.println("Write your message and press enter to send:");
			String msg = inputMsg.nextLine();
			// Save sender and message
			ArrayList<String> message = new ArrayList<String>();
			message.add(sender.getUsername());
			message.add(msg);
			//chat.add(message);
			int n = -10;
			for (int i = 0; i < sender.getMessages().size(); i++) {
				if (sender.getMessages().get(i).get(0).get(0).equals(receiver.getUsername())) {
					n = i;
				  	break;
				}
			}
			sender.getMessages().get(n).add(message);
			//Same for the receiver
			//(c.getUsername().equals(usernameuser
			int r = -10;
			for (int i = 0; i < receiver.getMessages().size(); i++) {
				if (receiver.getMessages().get(i).get(0).get(0).equals(sender.getUsername())) {
					r = i;
				  	break;
				}
			}
			receiver.getMessages().get(r).add(message);

		} else {
			System.err.println("A chat must be opened by a coach");
		}
	}
}
