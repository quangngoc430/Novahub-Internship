import java.util.Scanner;
import java.util.Random;

public class NumberGuess{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int randomNumber, yourNumber;
		
		System.out.println("I\'m thinking of a number from 1 to 10.");
		System.out.print("Your guess: ");

		yourNumber = input.nextInt();
		randomNumber = 1 + random.nextInt(10);

		System.out.println();
		if(yourNumber == randomNumber){
			System.out.println("That's right!  My secret number was " + randomNumber + "!");
		}
		else{
			System.out.println("Sorry, but I was really thinking of " + randomNumber + ".");
		}

	}
}