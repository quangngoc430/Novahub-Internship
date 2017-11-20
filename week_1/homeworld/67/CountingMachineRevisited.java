import java.util.Scanner;

public class CountingMachineRevisited{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int countFrom, countTo, countBy;

		System.out.print("Count from: ");
		countFrom = input.nextInt();
		System.out.print("Count to  : ");
		countTo = input.nextInt();
		System.out.print("Count by  : ");
		countBy = input.nextInt();

		System.out.println();
		for(int i = countFrom; i <= countTo; i = i + countBy){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}