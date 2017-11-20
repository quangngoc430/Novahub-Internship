import java.util.Random;

public class DiceDoubles{
	public static void main(String[] args) {
		Random random = new Random();

		int firstNumber, secondNumber;
		firstNumber = 0;
		secondNumber = 1;

		System.out.println("HERE COMES THE DICE!");
		System.out.println();

		while(firstNumber != secondNumber){
			
			firstNumber = 1 + random.nextInt(10);
			System.out.println("Roll #1: " + firstNumber);
			
			secondNumber = 1 + random.nextInt(10);
			System.out.println("Roll #2: " + secondNumber);

			System.out.println("The totatl is " + (firstNumber + secondNumber));
			System.out.println();
		}
	}
}