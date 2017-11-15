import java.util.Scanner;

public class HowOldAreYou{
	public static void main(String[] args){
		String myName;
		int myAge;

		Scanner input = new Scanner(System.in);

		System.out.print("Hey, what's your name? ");
		myName = input.next();
		System.out.print("\nOk, " + myName + ", how old are you? ");
		myAge = input.nextInt();
		
		System.out.println();

		if(myAge < 16){
			System.out.println("You can't drive.");
		}

		if(myAge < 18){
			System.out.println("You can't vote");
		}

		if(myAge < 25){
			System.out.println("You can't rent a car.");
		}

		if(myAge >= 25){
			System.out.println("YOu can do anything that's legal.");
		}
	}
}