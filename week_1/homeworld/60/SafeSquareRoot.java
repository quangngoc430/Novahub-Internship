import java.util.Scanner;

public class SafeSquareRoot{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("SQUARE ROOT!");

		int yourNumber;
		boolean firstInput = true;

		do{
			if(firstInput == true)
				System.out.print("Enter a number: ");
			else
				System.out.print("Try again: ");

			yourNumber = input.nextInt();

			if(yourNumber < 0){
				System.out.println("You can't take the square root of a negative number.");
			}
			else{
				System.out.println("The square root of " + yourNumber + " is " + Math.sqrt(yourNumber) + ".");
			}

			firstInput = false;
		}while(yourNumber < 0);
	}
}