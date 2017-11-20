import java.util.Scanner;

public class TwoMoreQuestion{
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String firstAnswer, secondAnswer, result = "";

    	System.out.println("TWO MORE QUESTIONS, BABY!");
    	System.out.println();
    	System.out.println("Think of something and I'll try to guess it!");
    	System.out.println();
    	System.out.print("Question 1) Does it stay inside or outside or both? ");
    	firstAnswer = input.next();
    	System.out.print("Question 2) Is it a living thing? ");
    	secondAnswer = input.next();

		if(firstAnswer.equals("inside") && secondAnswer.equals("yes")){
			result = "houseplant";
		}

		if(firstAnswer.equals("inside") && secondAnswer.equals("no")){
			result = "shower curtain";
		}

		if(firstAnswer.equals("outside") && secondAnswer.equals("yes")){
			result = "bison";
		}

		if(firstAnswer.equals("outside") && secondAnswer.equals("no")){
			result = "billboard";
		}

		if(firstAnswer.equals("Inside") && secondAnswer.equals("yes")){
			result = "dog";
		}

		if(firstAnswer.equals("Inside") && secondAnswer.equals("no")){
			result = "cell phone";
		}


		System.out.println();
		System.out.println("Result : " + result);
	}
}