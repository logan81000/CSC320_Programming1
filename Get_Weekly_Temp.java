package PROGRAMMING_1;

import java.util.Scanner;

public class Get_Weekly_Temp {
	
	public static void main(String[] arg) {
		String[] day = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		int[] temp = {65, 70, 68, 60, 75, 56, 82, 68};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a day of the week or enter week to see the whole week's forecast: ");
		String userinput = input.nextLine();
		input.close();
		if (userinput.equals("week")) {
			for (int i = 0; i < 7; i++) {
				System.out.println("The average temperature of " + day[i] + " is "+ temp[i] + "\u00B0" + "F");
			}
			System.out.println("The average temperature for the week is " + temp[7] + "\u00B0" + "F");
			
		}
		for (int i = 0; i < 7; i++) {
			if (day[i].equals(userinput)) {
				System.out.println("The average temperature of " + day[i] + " is "+ temp[i] + "\u00B0" + "F");
				System.exit(0);
			}
		}
		

	}
	

}
