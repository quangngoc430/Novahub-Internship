public class MoreVariablesAndPrinting{
	public static void main(String[] args){
		String myName, myEyes, myTeech, myHair;
		int myAge, myHeight, myWeight;

		myName = "Zed A. Shaw";
		myAge = 35;		// not a lie
		myHeight = 74; 	// inches
		myWeight = 180;	// lbs
		myEyes = "Blue";
		myTeech = "White";
		myHair = "Brown";

		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches tall.");
		System.out.println("He's " + myWeight + " pounds heavy.");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teech are usually " + myTeech + "depending on the coffee.");

		// This line is tricky; try to get it excatly right.
		System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + ".");
	}
}