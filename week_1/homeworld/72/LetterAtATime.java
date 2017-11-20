import java.util.Scanner;

public class LetterAtATime{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String message;

		System.out.print("What is your message? ");
		message = input.nextLine();

		System.out.println();
		System.out.println("Your message is " + message.length() + " charaters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		System.out.println("The last character is at positon " + (message.length() - 1) + " and is '" + message.charAt(message.length() - 1) + "'.");
		System.out.println();
		System.out.println("Here are all the characters, one at a time:");
		System.out.println();

		int countCharacterA = 0;
		int countCharacterE = 0;
		int countCharacterI = 0;
		int countCharacterO = 0;
		int countCharacterU = 0;

		for(int i = 0; i < message.length(); i++){
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
			if(message.charAt(i) == 'A' && message.charAt(i) == 'a'){
				countCharacterA++;
			}
			else if(message.charAt(i) == 'E' && message.charAt(i) == 'e'){
				countCharacterE++;
			}
			else if(message.charAt(i) == 'I'&& message.charAt(i) == 'i'){
				countCharacterI++;
			}
			else if(message.charAt(i) == 'O' && message.charAt(i) == 'o'){
				countCharacterO++;
			}
			else if(message.charAt(i) == 'U' && message.charAt(i) == 'u'){
				countCharacterU++;
			}
		}

		System.out.println();
		System.out.println("Your message contains the letter 'a' " + countCharacterA); 
		System.out.println("Your message contains the letter 'e' " + countCharacterE); 
		System.out.println("Your message contains the letter 'i' " + countCharacterI); 
		System.out.println("Your message contains the letter 'o' " + countCharacterO); 
		System.out.println("Your message contains the letter 'u' " + countCharacterU + " times. Isn't that interesting?"); 
	}
}