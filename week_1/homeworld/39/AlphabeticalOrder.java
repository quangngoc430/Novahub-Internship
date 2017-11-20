import java.util.Scanner;

public class AlphabeticalOrder{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String lastName, message = "";

		System.out.print("What's your last name? ");
		lastName = input.nextLine();

		if(lastName.compareTo("Carswell") <= 0){
			message = "you don't have to wait long";
		}
		else if(lastName.compareTo("Jones") <= 0){
			message = "that's not bad";
		}
		else if(lastName.compareTo("Smith") <= 0){
			message = "looks like a bit of a wait";
		}
		else if(lastName.compareTo("Young") <= 0){
			message = "it's gonna be a while";
		}
		else{
			message = "not going anywhere for a while?";
		}

		System.out.println(message + " , " + lastName);

	}
}