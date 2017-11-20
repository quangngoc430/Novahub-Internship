public class CompareToChallenge{
	public static void main(String[] args) {
		System.out.println("Comparing \"ngoc\" with \"thanh\" produces " + "hung".compareTo("thanh"));
		System.out.println("Comparing \"cum\" with \"hung\" produces " + "cum".compareTo("hung"));
		System.out.println("Comparing \"hai\" with \"hung\" produces " + "hai".compareTo("hung"));
		System.out.println("Comparing \"thanh\" with \"trung\" produces " + "thanh".compareTo("trung"));
		System.out.println("Comparing \"hung\" with \"vu\" produces " + "hung".compareTo("vu"));
	
		System.out.println("Comparing \"axe\" with \"axe\" produces " + "axe".compareTo("axe"));
		System.out.println("Comparing \"hoang\" with \"hoang\" produces " + "hoang".compareTo("hoang"));
	
		System.out.println("Comparing \"trung\" with \"hung\" produces " + "trung".compareTo("hung"));
		System.out.println("Comparing \"thanh\" with \"hung\" produces " + "thanh".compareTo("hung"));
		System.out.println("Comparing \"hoang\" with \"axe\" produces " + "hoang".compareTo("axe"));
		System.out.println("Comparing \"ngoc\" with \"minh\" produces " + "ngoc".compareTo("minh"));
		System.out.println("Comparing \"acc\" with \"acb\" produces " + "acc".compareTo("acb"));
	} 
}