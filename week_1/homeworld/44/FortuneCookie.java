import java.util.Random;

public class FortuneCookie{
	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("Fortune cookie says: \"You wil find happiness with a new love.\"");
		System.out.print("    ");
		System.out.print((1 + random.nextInt(54)) + " - ");
		System.out.print((1 + random.nextInt(54)) + " - ");
		System.out.print((1 + random.nextInt(54)) + " - ");
		System.out.print((1 + random.nextInt(54)) + " - ");
		System.out.print((1 + random.nextInt(54)) + " - ");
		System.out.println((1 + random.nextInt(54)));	
	}
}