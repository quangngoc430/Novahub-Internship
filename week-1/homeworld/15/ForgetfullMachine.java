import java.util.Scanner;

public class ForgetfullMachine{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Give me a word!");
		input.next();

		System.out.println("Give me a second word!");
		input.next();

		System.out.println("Great, now your favorite number?");
		input.next();

		System.out.println("And your second-favorite number...");
		input.next();

		System.out.println("Whew!  Wasn't that fun?");
	}
}