import java.util.Scanner;

public class Adventure1{
    
    public static String showQuestion(String currentRoom, String leftRoom, String rightRoom){
		Scanner input = new Scanner(System.in);
		String answer;
		
		System.out.println("You are in room "+ currentRoom +  "! Would you like to go room " +  leftRoom + " or " +  rightRoom + "?");
		System.out.print("> ");
		answer = input.next();
		System.out.println();
		
		return answer;
	}

	public static void main(String[] args) {
		String answer;

		System.out.println("WELCOME TO MITCHEL'S TINY ADVENTURE!");
		System.out.println();
		answer = showQuestion("R1", "R2", "R3");

		if(answer.equals("R2")){
			answer = showQuestion("R2", "R4", "R5");
			if(answer.equals("R4")){
				answer = showQuestion("R4", "E1", "E2");
				System.out.println("Result : " + answer);
			}
			else{ // R5
				answer = showQuestion("R5", "E3", "E4");
				System.out.println("Result : " + answer);
			}
		}
		else { // R3
			answer = showQuestion("R3", "R6", "R7");
			if(answer.equals("R6")){
				answer = showQuestion("R6", "E5", "E6");
				System.out.println("Result : " + answer);
			}
			else{ // R5
				answer = showQuestion("R7", "E7", "E8");
				System.out.println("Result : " + answer);
			}
		}

	}
}