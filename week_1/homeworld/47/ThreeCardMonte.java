import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int randomNumber, yourNumber;

		randomNumber = 1 + random.nextInt(3);

		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffing.");
		System.out.println("He lays down three cards.");
		System.out.println();
		System.out.println("Which one is the ace?");
		System.out.println();
		System.out.println("        ##  ##  ##");
		System.out.println("        ##  ##  ##");
		System.out.println("        1   2   3");
		System.out.println();
		System.out.print("> ");
		yourNumber = input.nextInt();
		System.out.println();

		if(randomNumber == yourNumber){
			System.out.println("You nailed it! Fast Eddie reluctantly hands over yout winnings, scowling.");
		}
		else{
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + randomNumber + ".");
		}
		System.out.println();

		if(randomNumber == 1){
			System.out.println("        AA  ##  ##");
			System.out.println("        AA  ##  ##");
			System.out.println("        1   2   3");
		}
		else if(randomNumber == 2){
			System.out.println("        ##  AA  ##");
			System.out.println("        ##  AA  ##");
			System.out.println("        1   2   3");
		}
		else{
			System.out.println("        ##  ##  AA");
			System.out.println("        ##  ##  AA");
			System.out.println("        1   2   3");
		}
	}
}