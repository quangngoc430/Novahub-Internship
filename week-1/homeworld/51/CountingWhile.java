import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		String message;
		int time;

		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		message = keyboard.nextLine();
		System.out.print("How many time? ");
		time = keyboard.nextInt();

		int n = 0;
		while ( n < time )
		{
			System.out.println( ((n+1) * 10) + ". " + message );
			n++;
		}

	}
}