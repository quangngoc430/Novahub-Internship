import java.util.Scanner;

public class TwentyQuestions{
	public static void main(String[] args) {
		String firstAnswer, secondAnswer, result;

		Scanner input = new Scanner(System.in);

		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an objext, and I'll try to guess it.");
		System.out.println();
		System.out.println("Question 1) It is animal, vegetable, or mineral?");
		System.out.print("> ");
		firstAnswer = input.next();
		
		System.out.println();
		System.out.println("Question 2) It is bigger than a breadbox?");
		System.out.print("> ");
		secondAnswer = input.next();

		if(firstAnswer.equals("animal")){
			if(secondAnswer.equals("yes")){
				result = "moose";
			}
			else{
				result = "squirrel";
			}
		}
		else if (firstAnswer.equals("vegetable")) {
			if(secondAnswer.equals("yes")){
				result = "watermelon";
			}
			else{
				result = "carrot";
			}
		}else{
			if(secondAnswer.equals("yes")){
				result = "Camaro";
			}
			else{
				result = "paper clip";
			}
		}

		System.out.println();
		System.out.println("My guess is that you are thinking of a " + result);
		System.out.println("I would ask you if I'm right, but I don't actually care.");
	}
}