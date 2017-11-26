package BT_8_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyIntStackTest {
	
	@Test
	public void testConstructor() {
		MyIntStack myIntStack = new MyIntStack(3);
		
		assertEquals(true, myIntStack.isEmpty());
	}
	
	@Test
	public void testIsEmpty() {
		MyIntStack myIntStack = new MyIntStack(3);
		
		assertEquals(true, myIntStack.isEmpty());
		
		myIntStack.push(2);

		assertEquals(false, myIntStack.isEmpty());
	}
	
	@Test
	public void testIsFull() {
		MyIntStack myIntStack = new MyIntStack(2);
		
		assertEquals(false, myIntStack.isFull());
		
		myIntStack.push(2);
		myIntStack.push(3);

		assertEquals(true, myIntStack.isFull());
	}
	
	@Test
	public void testPeek() {
		MyIntStack myIntStack = new MyIntStack(2);
		
		myIntStack.push(2);
		myIntStack.push(3);

		assertEquals(3, myIntStack.peek());
	}
	
	@Test
	public void testPop() {
		MyIntStack myIntStack = new MyIntStack(3);
				
		myIntStack.push(2);
		myIntStack.push(4);

		assertEquals(4, myIntStack.pop());
	}
	
	@Test
	public void testPush() {
		MyIntStack myIntStack = new MyIntStack(4);
		
		myIntStack.push(2303);
		myIntStack.push(564);
		
		assertEquals(564, myIntStack.pop());
		assertEquals(2303, myIntStack.pop());
		
	}
}
