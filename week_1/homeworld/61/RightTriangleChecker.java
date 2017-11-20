import java.util.Scanner;

public class RightTriangleChecker{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int firstSide, secondSide, thirdSide;
		boolean checkFirstSide, checkSecondSide, checkThirdSide;

		firstSide = secondSide = thirdSide = 0;
		checkFirstSide = checkSecondSide = checkThirdSide = false;

		System.out.println("Enter three integers:");

		do{
			if(checkFirstSide == false){
				System.out.print("Side 1: ");
				firstSide = input.nextInt();

				if(firstSide <= 0){
					System.out.println(firstSide + " is smaller than 1.  Try again.");
				}
				else{
					checkFirstSide = true;
				}
			}
			else if (checkSecondSide == false) {
				System.out.print("Side 2: ");
				secondSide = input.nextInt();

				if(firstSide <= secondSide){
					checkSecondSide = true;
				}
				else{
					System.out.println(secondSide + " is smaller than " + firstSide + ".  Try again.");
				}
			}
			else{
				System.out.print("Side 3: ");
				thirdSide = input.nextInt();

				if(secondSide <= thirdSide){
					checkThirdSide = true;
				}
				else{
					System.out.println(thirdSide + " is smaller than " + secondSide + ".  Try agian.");
				}
			}
		}while(checkFirstSide == false | checkSecondSide == false | checkThirdSide == false);
	
		System.out.println();
		System.out.println("Your three sides are " + firstSide + " " + secondSide + " " + thirdSide);

		if((firstSide * firstSide + secondSide * secondSide) == (thirdSide * thirdSide)){
			System.out.println("These sides *do* make a right triangle!");
		}
		else{
			System.out.println("NO!   These sides do not make a right triangle!");
		}
	}
}