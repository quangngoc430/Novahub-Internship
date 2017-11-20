import java.util.Scanner;

public class AgeIn5{
	public static void main(String[] args){
		String myName;
		int myAge;

		Scanner input = new Scanner(System.in);

		System.out.print("Hello. What is your name? ");
		myName = input.next();

		System.out.print("\nHi, " + myName + "! How old are you? ");
		myAge = input.nextInt();

		System.out.println("\nDid you know that in five years you will be " + (myAge + 5) + " years old?");
		System.out.println("And five years ago you were " + (myAge - 5) + "! Imagine that!");
	}
}