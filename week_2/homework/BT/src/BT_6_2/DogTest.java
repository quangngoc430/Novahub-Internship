package BT_6_2;

import org.junit.Test;

public class DogTest {
	@Test
	public void testGreeting() {
		Dog dog = new Dog();
		dog.greeting();
	}
	
	@Test
	public void testGreetingWithAnotherDog() {
		Dog dog = new Dog();
		Dog anotherDog = new Dog();
		
		dog.greeting(anotherDog);
	}
}
