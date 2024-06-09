package PROGRAMMING_1;
import java.util.*;

public class Looping_Construct_with_Floating_Point_Numbers {
	
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		List<Float> values = new ArrayList<Float>(); 
		List<Float> interest = new ArrayList<Float>(); 
		while (i<5) {
			System.out.print("Enter a value: ");
			float value = input.nextFloat();
			float inter = (float) (value * 1.2);
			values.add(value);
			interest.add(inter);
			i++;
		}
		input.close();
		float Total = 0;
		for (i = 0; i < values.size(); i++) {
			Total += values.get(i);
		}
		float Average = Total / 5;
		float Max = Collections.max(values);
		float Min = Collections.min(values);
		System.out.println("The total is " + Total);
		System.out.println("The average is " + Average);
		System.out.println("The maximum is " + Max);
		System.out.println("The minimum is " + Min);
		System.out.println("The interest for each number is " + interest);	
	}

}
