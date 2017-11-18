public class XsAndYs{
	public static void main(String[] args) {
		double x = -10.0;

		System.out.println(" x\ty");
		System.out.println("-----------------");

		for(int i = 0; i <= 40 ; i++){
			System.out.println(x + "\t" + (x*x));
			x = x + 0.5;
		}
	}
}