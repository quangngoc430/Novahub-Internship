import java.util.Scanner;

public class SpaceBoxing{
	public static void main(String[] args){
		int myWeight, planetIndex;
		double gravity;

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your current earth weight: ");
		myWeight = input.nextInt();

		System.out.println("\nI have information for the following planets:");
		System.out.println("     1. Venus   2. Mars    3. Jupiter");
		System.out.println("     4. Saturn  5. Uranus  6. Neptune");

		System.out.print("\nWhich planet are you visiting? ");
		planetIndex = input.nextInt();

		if(planetIndex == 1){
			gravity = 0.78;
		}
		else if (planetIndex == 2) {
			gravity = 0.39;
		}
		else if (planetIndex == 3){
			gravity = 2.65;
		}
		else if (planetIndex == 4) {
			gravity = 1.17;
		}
		else if (planetIndex == 5){
			gravity = 1.05;
		}
		else{
			gravity = 1.23;
		}

		System.out.println("\nYour weight would be " + gravity * myWeight + " pounds on that planet.");
	}
}