import java.util.Scanner;

public class BMICalc{
	public static void main(String[] args){
		double myHeight;
		int myWeight;

		Scanner input = new Scanner(System.in);

		System.out.print("Your height in m: ");
		myHeight = input.nextDouble();
		System.out.print("Your weight in kg: ");
		myWeight = input.nextInt();
		System.out.println("\nYour BMI is " + (myWeight / (myHeight * myHeight)));
	}
}