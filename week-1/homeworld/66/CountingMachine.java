import java.util.Scanner;

public class CountingMachine{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count;

		System.out.print("Count to: ");
		count = input.nextInt();

		for(int i = 0; i <= count; i++){
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
}