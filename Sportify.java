import java.util.Scanner;
public class Sportify{
public static void main(String[]args) {
	System.out.println("Type 1 if you are an Athlete or 2 if you are a Coach");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if (a == 1){
		System.out.println("Type 1 to edit your profile or 2 to view it");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i == 1) {
			System.out.println("What do you want to change? 1:position, 2:current_team, 3:height, 4:weight");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num == 1 || num == 2) {
				System.out.println("insert the new value");
				Scanner sc = new Scanner(System.in);
    			String s = sc.next();
    			.edit(num, s);
			}
    		else if (num == 3 || num == 4 ) {
				System.out.println("insert the new value");
				Scanner sc = new Scanner(System.in);
				double d = sc.nextDouble();
				.edit(num, d);
			}
		} else if (i == 2){
			.viewProfile();}
	} else if (a == 2) {
		System.out.println("Type 1 to edit your profile or 2 to view it");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i == 1) {
			System.out.println("What do you want to change? 1:years_of_experience, 2:team");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num == 1 ) {
				System.out.println("insert the new value");
				Scanner sc = new Scanner(System.in);
    			int y = sc.nextInt();
    			.edit(num, y);
			}
    		else if (num == 2) {
				System.out.println("insert the new value");
				Scanner sc = new Scanner(System.in);
				String s = sc.next();
				.edit(num, s);
			}
		} else if (i == 2){
			.viewProfile();
		}












}
}