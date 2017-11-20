import java.util.Scanner;

public class BMICategories{
	public static void main(String[] args){
		double myHeight, BMIValue;
		int myWeight;
		String BMICategory = "";

		Scanner input = new Scanner(System.in);

		System.out.print("Your height in m: ");
		myHeight = input.nextDouble();
		System.out.print("Your weight in kg: ");
		myWeight = input.nextInt();

		BMIValue = myWeight / (myHeight * myHeight);

		System.out.println();
		System.out.println("Your BMI is " + BMIValue);

		if(BMIValue < 18.5){
			BMICategory = "underweight";
		}

		if(BMIValue >= 18.5 && BMIValue <= 24.9){
			BMICategory = "normal weight";
		}

		if(BMIValue >= 25.0 && BMIValue <= 29.9){
			BMICategory = "overweight";
		}

		if(BMIValue >= 30.0){
			BMICategory = "obese";
		}

		System.out.println("BMI Category: " + BMICategory);

	}
}