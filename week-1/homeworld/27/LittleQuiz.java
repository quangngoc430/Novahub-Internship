import java.util.Scanner;

public class LittleQuiz{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int answer, numberOfCorrectAnswer = 0;

		System.out.print("Are ou ready for a quiz? ");
		input.next();
		System.out.println("Okay, here it comes!");
		System.out.println();
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("        1) Melbourne");
		System.out.println("        2) Anchorage");
		System.out.println("        3) Juneau");
		System.out.print("> ");
		answer = input.nextInt();

		if(answer == 3){
			numberOfCorrectAnswer++;
			System.out.println("\nThat's right!");
		}else{
			System.out.println("\nThat's wrong!");
		}

		System.out.println();
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int");
		System.out.println("        1) yes");
		System.out.println("        2) no");
		System.out.print("> ");
		answer = input.nextInt();

		if(answer == 2){
			numberOfCorrectAnswer++;
			System.out.println("\nThat's correct!");
		}else{
			System.out.println("\nSorry, \"cat\" is a string. ints can only store numbers.");
		}

		System.out.println();
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("        1) 5");
		System.out.println("        2) 11");
		System.out.println("        3) 15/3");
		System.out.print("> ");
		answer = input.nextInt();

		if(answer == 2){
			numberOfCorrectAnswer++;
			System.out.println("\nThat's correct!");
		}else{
			System.out.println("\nThat's wrong!");
		}

		System.out.println();
		System.out.println();
		System.out.println("Overall, you got " + numberOfCorrectAnswer + " out of " + 3 + "correct.");
		System.out.println("Thanks for playing!");
	}
}