package PROGRAMMING_1;
import java.util.Scanner;

public class Calculate_Average_Withholding {
	public static void main(String[] arg) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter weekly income: ");
		int income = myObj.nextInt();
		int withhold = 0;
		if (income < 500) {
			withhold = (int) (income * .1);
		}
		else if (income >= 500 && income < 1500) {
			withhold = (int) (income * .15);
		}
		else if (income >= 1500 && income < 2500) {
			withhold = (int) (income * .2);
		}
		else if (income >= 2500) {
			withhold = (int) (income * .3);
		}
		
		System.out.println("Your weekly average tax withholdings is " + withhold);

		
		
	}

}
