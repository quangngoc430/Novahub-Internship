import java.util.Scanner;
import java.util.Random;

public class NumberGuessingWithACounter{
	public static void main(String[] args) {
		int tries, yourNumber, randomNumber;

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();

		tries = 0;
		yourNumber = -1;
		randomNumber = 1 + random.nextInt(10);

		System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");

		while(yourNumber != randomNumber){
			
			tries = tries + 1;

			System.out.print("Your guess: ");
			yourNumber = keyboard.nextInt();
			
			if(yourNumber != randomNumber){
				System.out.println("That is incorrect.  Guess again.");
			}
			else{
				System.out.println("That's right!  You're a good guesser.");
			}
		
		}

		System.out.println("It only took you " + tries + " tries.");
	}
}