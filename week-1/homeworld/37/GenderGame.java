import java.util.Scanner;

public class GenderGame{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String myGender, myFirstName, myLastName, myStatus, displayName;
		int myAge;

		myStatus = "";
		displayName = "";

		System.out.print("What is your gender (M or F): ");
		myGender = input.next();
		System.out.print("First name: ");
		myFirstName = input.next();
		System.out.print("Last name: ");
		myLastName = input.next();
		System.out.print("Age: ");
		myAge = input.nextInt();

		if(myGender.equals("F") && myAge >= 20){
			System.out.println();
			System.out.print("Are you married, " + myFirstName + " (y or n)? ");
			myStatus = input.next();
		}

		if(myGender.equals("F") && myAge >= 20){
			if(myStatus.equals("y")){
				displayName = "Mrs. " + myLastName;
			}
			else{
				displayName = "Ms. " + myLastName;
			}
		}

		if(myGender.equals("F") && myAge < 20){
			displayName = myFirstName + " " + myLastName;
		}

		if(myGender.equals("M") && myAge >= 20){
			displayName = "Mr. " + myLastName; 
		}

		if(myGender.equals("M") && myAge < 20){
			displayName = myFirstName + " " + myLastName;
		}
		

		System.out.println();
		System.out.println("Then I shall call you " + displayName);	
	}

}