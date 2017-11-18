import java.util.Scanner;

public class AddingValuesForLoop{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int yourNumber, sum;

		System.out.print("Number: ");
		yourNumber = input.nextInt();
		sum = 0;

		System.out.println();

		for(int i = 1; i <= yourNumber; i++){
			System.out.print(i + " ");
			sum = sum + i;
		}

		System.out.println("\nThe sum is " + sum + ".");

	}
}