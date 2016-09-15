package pkgQB;

import java.util.Scanner;

public class QBRating {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Quarterback Rating Calculator");
		 System.out.print("Enter  number of touchdowns: ");
		 double TD = input.nextDouble();
		 System.out.print("Enter total number of yards: ");
		 double YDS = input.nextDouble();
		 System.out.print("Enter number of interceptions: ");
		 double INT = input.nextDouble();
		 System.out.print("Enter number of completions: ");
		 double COMP = input.nextDouble();
		 System.out.print("Enter number of passes attempted: ");
		 double ATT = input.nextDouble();
		 
		 double a = (COMP / ATT - 0.3) * 5;
		 double b = (YDS / ATT - 3) * 0.25;
		 double c = (TD / ATT) * 20;
		 double d = 2.375 - (INT / ATT * 25);
		 
		 double rating = (a + b + c + d) / 6 * 100;
		 
		 if (rating < 0) {
			 rating = 0;
		 }
		 else if (rating > 2.375) {
			 rating = 2.375;
		 }
		 
		 System.out.print("The quarterback rating is " + Math.round(1000.0 * rating) / 1000.0 + ".");
	}

}
