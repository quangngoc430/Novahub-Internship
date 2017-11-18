import java.util.Scanner;
import java.util.Random;

public class HiLoLimited{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();

		int maximizeTries = 7;
		int tries = 0;
		int yourNumber = 0;
		int randomNumber = 1 + random.nextInt(100);

		System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");

		while(yourNumber != randomNumber && tries < maximizeTries){
			tries++;

			if(tries == 1){
				System.out.print("First guess: ");
			}
			else{
				System.out.print("Guess # " + tries + ": ");
			}

			yourNumber = keyboard.nextInt();

			if(yourNumber < randomNumber){
				System.out.println("Sory, you are too low");
			}
			else if (yourNumber > randomNumber) {
				System.out.println("Sorry, that guess is too high.");
			}
			else{
				System.out.println("You guessed it!  What are the odds?!?");		
			}
			
			if(tries == maximizeTries && yourNumber != randomNumber){
				System.out.println("Sorry, ou didn't guess it in " + maximizeTries + " tries.  You lose.");
			}
		}
	}
}