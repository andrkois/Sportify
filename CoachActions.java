import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;
import java.util.ArrayList;


public class CoachActions {

	ArrayList<Athletes> athletesearray;
	Coaches coach;
	private int numberOfAthletes;

	public CoachActions(ArrayList<Athletes> a, Coaches c, int n) {
		athletesearray = a;
		coach = c;
		numberOfAthletes = n;

	}
    public void showProfile() {
        System.out.println(coach.getName()+coach.getAge()+ coach.getSport()+ coach.getTeam()+
        coach.getYears()+ coach.getBio());

}
	//int numberOfAthletes = athletesearray.size();
	//sorting athletes array in descending order based on Likes
	public void descendingLikeFilter() {
		for (int k=0; k < numberOfAthletes; k++) {
			int max = 0;
			for (int i=k; i < numberOfAthletes; i++) {
				if ((athletesearray.get(max)).getLikes() < (athletesearray.get(i)).getLikes()) {
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
            			System.out.println("\nException thrown : " + e);
        			}
				}
			}
		}
 	}

 	public void ascendingLikeFilter() {
		for (int k=0; k < numberOfAthletes; k++) {
			int max = 0;
			for (int i=k; i < numberOfAthletes; i++) {
				if ( (athletesearray.get(max)).getLikes() > (athletesearray.get(i)).getLikes()) {
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
					    System.out.println("\nException thrown : " + e);
        			}
				}
			}
		}
 	}

	public void descendingAgeFilter() {
		for (int k=0; k < numberOfAthletes; k++) {
			int max = 0;
			for (int i=k; i < numberOfAthletes; i++) {
				if ( (athletesearray.get(max)).getAge() < (athletesearray.get(i)).getAge()) {
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
            			System.out.println("\nException thrown : " + e);
        			}
				}
			}
		}
 	}

 	public void ascendingAgeFilter() {
 		for (int k=0; k < numberOfAthletes; k++) {
 			int max = 0;
 			for (int i=k; i < numberOfAthletes; i++) {
 				if ((athletesearray.get(max)).getAge() > (athletesearray.get(i)).getAge()) {
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
            			System.out.println("\nException thrown : " + e);
        			}
 				}
 			}
 		}
 	}

 	public void descendingSportFilter() {
 		for (int k=0; k < numberOfAthletes; k++) {
 			int max = 0;
 			for (int i=k; i < numberOfAthletes; i++) {
 				if ( ((athletesearray.get(max)).getSport()).compareTo((athletesearray.get(i)).getSport())<0) {
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
            			System.out.println("\nException thrown : " + e);
        			}
 				}
 			}
 		}
 	}

	public void ascendingSportFilter() {
		for (int k=0; k < numberOfAthletes; k++) {
			int max = 0;
			for (int i=k; i < numberOfAthletes; i++) {
				if (((athletesearray.get(max)).getSport()).compareTo((athletesearray.get(i)).getSport())>0) {
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
            			System.out.println("\nException thrown : " + e);
        			}
				}
			}
		}
 	}

	public void descendingPositionFilter() {
		for (int k=0; k < numberOfAthletes; k++) {
			int max = 0;
			for (int i=k; i < numberOfAthletes; i++) {
				if (((athletesearray.get(max)).getPosition()).compareTo((athletesearray.get(i)).getPosition())<0){
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
            			System.out.println("\nException thrown : " + e);
        			}
				}
			}
		}
 	}

 	public void ascendingPositionFilter() {
 		for (int k=0; k < numberOfAthletes; k++) {
 			int max = 0;
 			for (int i=k; i < numberOfAthletes; i++) {
 				if ( ((athletesearray.get(max)).getPosition()).compareTo((athletesearray.get(i)).getPosition())>0) {
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
            			System.out.println("\nException thrown : " + e);
        			}
 				}
 			}
 		}
 	}

	public void descendingHeightFilter() {
		for (int k=0; k < numberOfAthletes; k++) {
			int max = 0;
			for (int i=k; i < numberOfAthletes; i++) {
				if ( (athletesearray.get(max)).getHeight() < (athletesearray.get(i)).getHeight()) {
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
            			System.out.println("\nException thrown : " + e);
        			}
				}
			}
		}
 	}

	public void ascendingHeightFilter() {
		for (int k=0; k < numberOfAthletes; k++) {
			int max = 0;
			for (int i=k; i < numberOfAthletes; i++) {
				if ( (athletesearray.get(max)).getHeight() > (athletesearray.get(i)).getHeight()) {
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
            			System.out.println("\nException thrown : " + e);
        			}
				}
			}
		}
 	}

	public void descendingWeightFilter() {
		for (int k=0; k < numberOfAthletes; k++) {
			int max = 0;
			for (int i=k; i < numberOfAthletes; i++) {
				if ((athletesearray.get(max)).getWeight() < (athletesearray.get(i)).getWeight()) {
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
            			System.out.println("\nException thrown : " + e);
        			}
				}
			}
		}
 	}

	public void ascendingWeightFilter() {
		for (int k=0; k < numberOfAthletes; k++) {
			int max = 0;
			for (int i=k; i < numberOfAthletes; i++) {
				if ( (athletesearray.get(max)).getWeight() > (athletesearray.get(i)).getWeight()) {
					try {
						Collections.swap(athletesearray, max, i);
						max = i;
					} catch (IndexOutOfBoundsException e) {
            			System.out.println("\nException thrown : " + e);
        			}
				}
			}
		}
 	}

	public void showAthletes() {
		descendingLikeFilter();
		boolean continueLoop = true;
		Scanner input3 = new Scanner(System.in);
		do {
			try {
				System.out.println("The default filter is the descending like filter.Do you want to change it? 1 = YES , 2 = NO");
				int choice2 = input3.nextInt();
				if (choice2 == 1) {
					Scanner input4 = new Scanner(System.in);
					boolean stop = true;
					do {
						try {
							System.out.println("Which filter do you want to use ?\n1. ascendingLikeFilter\n2. descendingAgeFilter\n3. ascendingAgeFilter\n"
								+"4. descendingSportFilter\n5. ascendingSportFilter\n6. descendingPositionFilter\n7. ascendingPositionFilter\n"
								+"8. descendingHeightFilter\n9. ascendingHeightFilter\n10. descendingWeightFilter\n11. ascendingWeightFilter");
							int choice = input4.nextInt();
							if (choice == 1) {
								ascendingLikeFilter();
							} else if (choice == 2) {
								descendingAgeFilter();
							} else if (choice == 3) {
								ascendingAgeFilter();
							} else if (choice == 4) {
								descendingSportFilter();
							} else if (choice == 5) {
								ascendingSportFilter();
							} else if (choice == 6) {
								descendingPositionFilter();
							} else if (choice == 7) {
								ascendingPositionFilter();
							} else if (choice == 8) {
								descendingHeightFilter();
							} else if (choice == 9) {
								ascendingHeightFilter();
							} else if (choice == 10) {
								descendingWeightFilter();
							} else {
								ascendingWeightFilter();
							}
							stop = false;
						} catch (InputMismatchException e3) {
							System.out.println("Please give a number between 1 and 11");
							input4.nextLine();
						} catch (ArithmeticException e2) {
							System.out.println("Please give a number between 1 and 11");
							input4.nextLine();
						}
					} while (stop);
				}
				continueLoop = false;
			} catch (InputMismatchException e1) {
				System.out.println("Please give number 1 or 2");
				input3.nextLine();
			} catch (ArithmeticException e2) {
				System.out.println("Please give number 1 or 2");
				input3.nextLine();
			}
		} while (continueLoop);

		boolean f = true ;
		int h1 = 0 ;
		int h2 = 0 ;
		do {
			if ( h1 + 10 > numberOfAthletes) {
				h2 = numberOfAthletes;
			} else {
				h2 = h1 + 10;
			}
			for (int counter = h1; counter < h2; counter++) {
				System.out.printf("%d.%s\n",counter+1,showBasicProfile(counter));
			}
			//Scanner input = new Scanner(System.in);
			Scanner in = new Scanner(System.in);
			boolean f1 = true;
			do {
				try {
		    		System.out.println("Are you interested in any athletes? Type 1 for YES 2 for NO");
		    		int ans = in.nextInt();
		   			while (ans == 1) {
						System.out.println("In which athlete where you interested in ?");
						System.out.println("Please write their ascending number");
						int numberOfChosenAthlete = in.nextInt() - 1;
						if (numberOfChosenAthlete >= 0 && numberOfChosenAthlete < numberOfAthletes) {
							//add like
							(athletesearray.get(numberOfChosenAthlete)).addLike();
							//send message
							System.out.println("Do you want to reach out? Type 1 for YES 2 for NO");
							int reachout = in.nextInt();
							if (reachout == 1) {
								Chat.sendMessage(athletesearray.get(numberOfChosenAthlete), coach, Chat.checkChat(athletesearray.get(numberOfChosenAthlete), coach));
							}
						}
						System.out.println("Were you interested in anyone else? Type 1 for YES 2 for NO");
						ans = in.nextInt();
					}
					f1 = false;
				} catch (InputMismatchException e1) {
					System.out.println("Please give number 1 or 2");
					in.nextLine();
				} catch (ArithmeticException e2) {
					System.out.println("Please give number 1 or 2");
					in.nextLine();
				}
			} while (f1);
			Scanner input2 = new Scanner(System.in);
			boolean f2 = true;
			do {
				try {
					System.out.println("Want to see more athletes ? ");
					String choice3 = input2.nextLine();
					if (choice3 == "no") {
						f = false ;
					}
					f2 = false;
				} catch (InputMismatchException e1) {
					System.out.println("Please write YES or NO ");
					input2.nextLine();
				}
			} while (f2);
			h1 = h2;
		}while(h2 != numberOfAthletes && f);
	}
//oi methodoi na deixnoun kai ta likes(getLikes())
	public String showBasicProfile(int number) {
		return (athletesearray.get(number)).getName()+ " " +(athletesearray.get(number)).getAge()+" "+(athletesearray.get(number)).getSport()+" "+(athletesearray.get(number)).getPosition()+" "+
							(athletesearray.get(number)).getCurrent_team()+" "+(athletesearray.get(number)).getHeight()+" "+(athletesearray.get(number)).getWeight();
	}

	public void showAllProfile(int number) {
		System.out.println((athletesearray.get(number)).getName()+" "+ (athletesearray.get(number)).getAge() +" "+ (athletesearray.get(number)).getSport()+ " " + (athletesearray.get(number)).getPosition()+
							" " +(athletesearray.get(number)).getCurrent_team()+" "+(athletesearray.get(number)).getHeight()+" "+(athletesearray.get(number)).getWeight()+" "+(athletesearray.get(number)).getBio());
	}

	public void seeWholeConversation(Users receiver) {
			Chat.seeConversation(coach.getMessages(), receiver);
			System.out.println("Do you want to send a new message? Type 1 for YES 2 for NO");
			//Scanner input = new Scanner(System.in);
			Scanner in = new Scanner(System.in);
			int reachout = in.nextInt();
			if (reachout == 1) {
				Chat.sendMessage(receiver, coach, Chat.checkChat(receiver, coach));
			}
	}

	public void sendNewMessage(Users receiver) {
			Chat.sendMessage(receiver,coach, Chat.checkChat(receiver, coach));
	}
}
