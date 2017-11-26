package BT_6_2;

import org.junit.Test;

public class BigDogTest {
	@Test
	public void testGreeting() {
		BigDog bigDog = new BigDog();
		bigDog.greeting();
	}
	
	@Test
	public void testGreetingWithAnotherDog() {
		BigDog bigDog = new BigDog();
		Dog anotherDog = new Dog();
		
		bigDog.greeting(anotherDog);
	}
}
