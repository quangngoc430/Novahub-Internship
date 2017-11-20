import java.util.Scanner;

public class NameAgeAndSalary{
	public static void main(String[] args){
		String myName;
		int myAge;
		double myHeight;

		Scanner input = new Scanner(System.in);

		System.out.println("Hello. What is your name?");
		myName = input.nextLine();

		System.out.println("\nHi, " + myName + "! How ola are you?");
		myAge = input.nextInt();

		System.out.println("\nSo you're " + myAge + ", eh? That's not old at all!");
		System.out.println("How much do you make, " + myName + "?");
		myHeight = input.nextDouble();

		System.out.println("\n" + myHeight + "! I hope that's per hour and not per year! LOL!");
	}
}