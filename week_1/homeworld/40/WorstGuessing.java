import java.util.Scanner;
import java.util.Random;

public class WorstGuessing{
	public static void main(String[] args) {
		int secretNumber, yourNumber;
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		System.out.println("TEH WORST NUMBER GESSING GAME EVAR!!!!!!!!!");
		System.out.println();
		System.out.print("I\"M THNKING OF A NBR FROM 1-10. TRY 2 GESS! ");
		yourNumber = Integer.parseInt(input.nextLine());
		System.out.println();

		secretNumber = random.nextInt(11);

		if(secretNumber == yourNumber){
			System.out.println("WOOT! U SUXOR!!!  I PWN JOO!!!  IT WAS " + secretNumber + "!"); 
		}
		else{
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + secretNumber + "!");
		}

	}
}