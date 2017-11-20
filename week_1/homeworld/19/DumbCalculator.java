import java.util.Scanner;

public class DumbCalculator{
	public static void main(String[] args){
		double firstNumber, secondNumber, thirdNumber;

		Scanner input = new Scanner(System.in);

		System.out.print("\nWhat is your first number? ");
		firstNumber = input.nextDouble();
		System.out.print("What is your second number? ");
		secondNumber = input.nextDouble();
		System.out.print("What is your third number? ");
		thirdNumber = input.nextDouble();

		System.out.println("\n( " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " ) / 2 is... " + ((firstNumber + secondNumber + thirdNumber) / 2));
	}
}