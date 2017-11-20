import java.util.Scanner;
import java.util.Random;

public class KeepGuessing{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int yourNumber, randomNumber;

		yourNumber = 0;
		randomNumber = 1 + random.nextInt(10);
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");

		while(yourNumber != randomNumber){
			System.out.print("Your guess: ");
			yourNumber = input.nextInt();
			if(yourNumber != randomNumber){
				System.out.println("That is incorrect. Guess again.");
			}
		}

		System.out.println("That's right. You're a good guesser.");
	}
}