import java.util.Scanner;
import java.util.Random;

public class OneShotHilo{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int yourNumber, randomNumber;
		randomNumber = 1 + random.nextInt(100);

		System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
		System.out.print("> ");
		yourNumber = input.nextInt();

		System.out.println();

		if(yourNumber != randomNumber){
			System.out.println("Sorry, you are too high.  I was thinking of " + randomNumber);
		}
		else{
			System.out.println("You guessed it!  What are the odds?!?");
		}
	}
}