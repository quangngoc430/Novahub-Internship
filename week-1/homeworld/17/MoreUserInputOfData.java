import java.util.Scanner;

public class MoreUserInputOfData{
	public static void main(String[] args){
		String firstName, lastName, loginName;
		int grade, studentID;
		double GPA;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the following information so I cal sell it for a profit!");
		System.out.print("\nFirst name: ");
		firstName = input.next();
		System.out.print("Last name: ");
		lastName = input.next();
		System.out.print("Grade (9-12): ");
		grade = input.nextInt();
		System.out.print("Student ID: ");
		studentID = input.nextInt();
		System.out.print("Login: ");
		loginName = input.next();
		System.out.print("GPA (0.0-4.0): ");
		GPA = input.nextDouble();

		System.out.println("\nYour information:");
		System.out.println("\tLogin: " + loginName);
		System.out.println("\tID:    " + studentID);
		System.out.println("\tName:  " + lastName + ", " + firstName);
		System.out.println("\tGPA:   " + GPA);
		System.out.println("\tGrade: " + grade);
	}
}