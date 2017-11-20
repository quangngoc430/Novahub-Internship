import java.util.Scanner;

public class AddingValuesInALoop{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int yournumber = -1;
		int sum = 0;

		System.out.println("I will add up the numbers ou give me.");

		while(yournumber != 0){
			System.out.print("Number: ");
			yournumber = keyboard.nextInt();

			sum = sum + yournumber;

			if(yournumber != 0)
				System.out.println("The total so far is " + sum + ".");
		}

		System.out.println();
		System.out.println("The total is " + sum + ".");
	}
}