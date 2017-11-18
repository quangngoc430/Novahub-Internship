import java.util.Scanner;

public class HowOldAreYou2{
	public static void main(String[] args){
		String myName, message;
		int myAge;	

		Scanner input = new Scanner(System.in);

		System.out.print("Hey, what's your name? (Sorry, I keep forgetting). "); 
		myName = input.next();
		System.out.print("Ok, " + myName + ", how old are you? ");
		myAge = input.nextInt();

		System.out.println();

		if(myAge < 16){
			message = "You can't drive";
		}
		else if(myAge >= 16 && myAge <= 17){
			message = "You can drive but not vote";
		}
		else if(myAge >= 18 && myAge <= 24){
			message = "You can vote but not rent a car";
		}
		else {
			message = "You can do pretty much anything";
		}

		System.out.println(message + ", " + myName);
	}
}