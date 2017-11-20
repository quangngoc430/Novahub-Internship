import java.util.Scanner;

public class CollatzSequence{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int yourNumber, max, steps;
		max = 0;
		steps = 1;

		System.out.print("Starting number: ");
		yourNumber = input.nextInt();

		System.out.print(yourNumber + "\t");

		while(yourNumber > 1){
			steps++;
			if(yourNumber % 2 == 0){
				yourNumber = yourNumber / 2;
				System.out.print(yourNumber + "\t");
			}
			else{
				yourNumber = yourNumber * 3 + 1;
				System.out.print(yourNumber + "\t");
			}

			if(steps % 10 == 0 && yourNumber != 1){
				System.out.println();
			}

			if(yourNumber > max){
				max = yourNumber;
			}
		}

		System.out.println("\nTerminated after " + steps + " steps. The largest value was " + max + ".");
	}
}