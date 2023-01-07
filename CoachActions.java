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
        System.out.println(" Name: " + coach.getName()+" Age: "+coach.getAge()+" Sport: "+ coach.getSport()+" Team: "+ coach.getTeam()+
       " Years_of_Experience: " + coach.getYears()+"  Bio: " + coach.getBio());

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
			System.out.println("The default filter is the descending like filter.Do you want to change it? 1 = YES , 2 = NO");
			try {
				int choice2 = input3.nextInt();
				if (choice2 == 1) {
					Scanner input4 = new Scanner(System.in);
					boolean stop = true;
					do {
						System.out.println("Which filter do you want to use ?\n1. ascendingLikeFilter\n2. descendingAgeFilter\n3. ascendingAgeFilter\n"
							+"4. descendingSportFilter\n5. ascendingSportFilter\n6. descendingPositionFilter\n7. ascendingPositionFilter\n"
							+"8. descendingHeightFilter\n9. ascendingHeightFilter\n10. descendingWeightFilter\n11. ascendingWeightFilter");
						try {
							int choice = input4.nextInt();
							if (choice == 1) {
								ascendingLikeFilter();
								stop = false;
							} else if (choice == 2) {
								descendingAgeFilter();
								stop = false;
							} else if (choice == 3) {
								ascendingAgeFilter();
								stop = false;
							} else if (choice == 4) {
								descendingSportFilter();
								stop = false;
							} else if (choice == 5) {
								ascendingSportFilter();
								stop = false;
							} else if (choice == 6) {
								descendingPositionFilter();
								stop = false;
							} else if (choice == 7) {
								ascendingPositionFilter();
								stop = false;
							} else if (choice == 8) {
								descendingHeightFilter();
								stop = false;
							} else if (choice == 9) {
								ascendingHeightFilter();
								stop = false;
							} else if (choice == 10) {
								descendingWeightFilter();
								stop = false;
							} else if (choice == 11) {
								ascendingWeightFilter();
								stop = false;
							}
						} catch (InputMismatchException e3) {
							System.out.println("Please give a number between 1 and 11");
							input4.next();
						} catch (ArithmeticException e2) {
							System.out.println("Please give a number between 1 and 11");
							input4.next();
						}
					} while (stop);
				}
				if (choice2 == 1 || choice2 == 2) {
					continueLoop = false;
				}
			} catch (InputMismatchException e1) {
				System.out.println("Please give number 1 or 2");
				input3.next();
			} catch (ArithmeticException e2) {
				System.out.println("Please give number 1 or 2");
				input3.next();
			}
		} while (continueLoop);

		boolean f = true ;
		int h1 = 0 ;
		int h2 = 0 ;
		int numofath = 0;
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
			boolean f11 = true;
			boolean flag1 = true;
			do {
				System.out.println("Are you interested in any athletes? Type 1 for YES 2 for NO");
				try {
					int ans = in.nextInt();
		   			while (ans == 1) {
						do {
							System.out.println("In which athlete where you interested in ?");
							System.out.println("Please write their ascending number");
							try {
								numofath = in.nextInt() - 1;
								if (numofath > 0 && numofath < numberOfAthletes) {
									flag1 = false;
								}
							} catch (InputMismatchException e1) {
								System.out.println("Please give a number between 1 and " + numberOfAthletes );
								in.next();
							} catch (ArithmeticException e2) {
								System.out.println("Please give a number between 1 and " + numberOfAthletes );
								in.next();
							}

						}while(flag1);
						int numberOfChosenAthlete = numofath;
						if (numberOfChosenAthlete > 0 && numberOfChosenAthlete < numberOfAthletes) {
							showAllProfile(numberOfChosenAthlete)
							//add like
							athletesearray.get(numberOfChosenAthlete).addLike();
							//send message
							System.out.println("Do you want to reach out? Type 1 for YES 2 for NO");
							int reachout = in.nextInt();
							if (reachout == 1) {
								Chat.sendMessage(athletesearray.get(numberOfChosenAthlete), coach, Chat.checkChat(athletesearray.get(numberOfChosenAthlete), coach));
							}
						}

						do {
							System.out.println("Were you interested in anyone else? Type 1 for YES 2 for NO");
							try {
								ans = in.nextInt();
								if (ans == 1 || ans == 2) {
									f11 = false;
								}
							} catch (InputMismatchException e1) {
								System.out.println("Please give number 1 or 2");
								in.next();
							} catch (ArithmeticException e2) {
								System.out.println("Please give number 1 or 2");
								in.next();
							}
						} while(f11);
					}
					if (ans == 1 || ans == 2) {
						f1 = false;
					}
				} catch (InputMismatchException e1) {
					System.out.println("Please give number 1 or 2");
					in.next();
				} catch (ArithmeticException e2) {
					System.out.println("Please give number 1 or 2");
					in.next();
				}
			} while (f1);
			Scanner input2 = new Scanner(System.in);
			boolean f2 = true;
			do {
				System.out.println("Want to see more athletes ? Type 1 for YES 2 for NO");
				try {
					int choice3 = input2.nextInt();
					if (choice3 == 2) {
						f = false ;
					}
					if (choice3 == 1 || choice3 == 2) {
						if (choice3 == 1 AND h2 = numberOfAthletes) {
							System.out.println("There aren't any athletes left")
							f = false;
						}
						f2 = false;
					}
				} catch (InputMismatchException e1) {
					System.out.println("Please give number 1 or 2");
					input2.next();
				}
			} while (f2);
			h1 = h2;
		}while(h2 != numberOfAthletes && f);
	}
//oi methodoi na deixnoun kai ta likes(getLikes())
	public String showBasicProfile(int number) {
		return ("Username: " + athletesearray.get(number).getUsername() + " Name: " +athletesearray.get(number).getName()+ " Age: " +(athletesearray.get(number)).getAge()+" Sport: "+(athletesearray.get(number)).getSport()+" Position: "+(athletesearray.get(number)).getPosition()+" Current Team: "+
							(athletesearray.get(number)).getCurrent_team()+" Height: "+(athletesearray.get(number)).getHeight()+" Weight: "+(athletesearray.get(number)).getWeight() + " Likes: " + athletesearray.get(number).getLikes()) ;
	}

	public void showAllProfile(int number) {
		System.out.println("Username: " + athletesearray.get(number).getUsername() +" Name: " + athletesearray.get(number).getName()+" Age: "+ (athletesearray.get(number)).getAge() +" Sport: "+ (athletesearray.get(number)).getSport()+ " Position: " + (athletesearray.get(number)).getPosition()+
							"Current Team: " +(athletesearray.get(number)).getCurrent_team()+" Height: "+(athletesearray.get(number)).getHeight()+" Weight: "+(athletesearray.get(number)).getWeight()+" Bio: "+(athletesearray.get(number)).getBio()+ " Likes: " + athletesearray.get(number).getLikes()) ;
	}

	public void seeWholeConversation(Users receiver) {
			Chat.seeConversation(coach.getMessages(), receiver);
			Scanner in = new Scanner(System.in);
			int reachout;
			System.out.println("Do you want to send a new message? Type 1 for YES 2 for NO");
			reachout = in.nextInt();
			 while (reachout!=1 && reachout!=2) {
				System.out.println("Wrong answer.Do you want to send a new message? Type 1 for YES 2 for NO");
				reachout = in.nextInt();
			 }

			if (reachout == 1) {
				Chat.sendMessage(receiver, coach, Chat.checkChat(receiver, coach));
			}
	}

	public void sendNewMessage(Users receiver) {
			Chat.sendMessage(receiver,coach, Chat.checkChat(receiver, coach));
	}
}
