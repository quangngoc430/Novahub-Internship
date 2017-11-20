import java.util.Random;

public class Dice{
	public static void main(String[] args) {
		Random random = new Random();
		int firstNumber, secondNumber;

		firstNumber = 1 + random.nextInt(6);
		secondNumber = 1 + random.nextInt(6);

		System.out.println("HERE COMES THE DICE");
		System.out.println();
		System.out.println("Roll #1: " + firstNumber);
		System.out.println("Roll #2: " + secondNumber);
		System.out.println("The total is " + (firstNumber + secondNumber) + "!");
	}
}