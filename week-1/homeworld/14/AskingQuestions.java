import java.util.Scanner;

public class AskingQuestions{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int age, heightFeet, heightInches;
		double weight;

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.print("How feet tall are you? ");
		heightFeet = keyboard.nextInt();

		System.out.print("And how many inches? ");
		heightInches = keyboard.nextInt();

		System.out.print("How much do you weight? ");
		weight = keyboard.nextDouble();

		System.out.println("So you're " + age + " old, " + heightFeet + "'" + heightInches + "\"" + " tall and " + weight + " heavy.");
	}
}