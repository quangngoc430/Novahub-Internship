import java.util.Random;

public class ShorterDoubleDice{
	public static void main(String[] args) {
		Random random = new Random();

		int firstNumber, secondNumber;

		System.out.println("HERE COME THE DICE!");
		System.out.println();

		do{
			firstNumber = 1 + random.nextInt(10);
			System.out.println("Roll #1: " + firstNumber);
			secondNumber = 1 + random.nextInt(10);
			System.out.println("Roll #2: " + secondNumber);
			System.out.println("The total is " + (firstNumber + secondNumber) + "!");
			System.out.println();
		}while(firstNumber != secondNumber);
	}
}