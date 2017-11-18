import java.util.Scanner;

public class AgeMessages3 {
	public static void main(String[] args) {
		String myName, message = "";
		int myAge;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Your name: ");
		myName = input.next();

		System.out.print("Your age: ");
		myAge = input.nextInt();

		if(myAge < 16){
			message = "You can't drive";
		}

		if(myAge >= 16 && myAge <= 17){
			message = "You can drive but not vote.";
		}

		if(myAge >= 18 && myAge <= 24){
			message = "You can vote but not rent a car";
		}

		if(myAge >= 25){
			message = "You can do pretty much anything.";
		}

		System.out.println();
		System.out.println(message + ", " + myName + ".");
	}
}