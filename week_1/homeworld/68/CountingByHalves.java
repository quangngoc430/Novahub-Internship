public class CountingByHalves{
	public static void main(String[] args) {
		double x = -10.0;

		System.out.println(" x");
		System.out.println("----");
		
		for(int i = 0; i < 41; i++){
			System.out.println(x);
			x = x + 0.5;
		}
	}
}