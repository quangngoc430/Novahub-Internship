package BT_5_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineSubTest {
	
	@Test
	public void testConstructorWithTwoArguments() {
		Point begin = new Point(3, 6);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		
		assertEquals(3, lineSub.getBeginX());
		assertEquals(6, lineSub.getBeginY());
		assertEquals(5, lineSub.getEndX());
		assertEquals(7, lineSub.getEndY());
	}
	
	@Test
	public void testConstructorWithFourArguments() {
		LineSub lineSub = new LineSub(1, 2, 3, 4);
		
		assertEquals(1, lineSub.getBeginX());
		assertEquals(2, lineSub.getBeginY());
		assertEquals(3, lineSub.getEndX());
		assertEquals(4, lineSub.getEndY());
	}
	
	@Test
	public void testGetBegin() {
		Point begin = new Point(4, 6);
		Point end = new Point(7, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		
		assertEquals(4, lineSub.getBegin().getX());
		assertEquals(6, lineSub.getBegin().getY());
	}
	
	@Test
	public void testGetEnd() {
		Point begin = new Point(3, 6);
		Point end = new Point(15, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		
		assertEquals(15, lineSub.getEnd().getX());
		assertEquals(7, lineSub.getEnd().getY());
	}
	
	@Test
	public void testSetBegin() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		lineSub.setBegin(new Point(3, 59));
		
		assertEquals(3, lineSub.getBeginX());
		assertEquals(59, lineSub.getBeginY());
	}
	
	@Test
	public void testSetEnd() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		lineSub.setEnd(new Point(23, 99));

		assertEquals(23, lineSub.getEndX());
		assertEquals(99, lineSub.getEndY());
	}
	
	@Test
	public void testGetBeginX() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		
		assertEquals(32, lineSub.getBeginX());
	}
	
	@Test
	public void testGetBeginY() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		
		assertEquals(36, lineSub.getBeginY());
	}
	
	@Test
	public void testGetEndX() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		
		assertEquals(5, lineSub.getEndX());
	}
	
	@Test
	public void testGetEndY() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		
		assertEquals(7, lineSub.getEndY());
	}
	
	@Test
	public void testSetBeginX() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		lineSub.setBeginX(45);
		
		assertEquals(45, lineSub.getBeginX());
	}
	
	@Test
	public void testSetBeginY() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		lineSub.setBeginY(4);
		
		assertEquals(4, lineSub.getBeginY());
	}

	@Test
	public void testSetBeginXY() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		lineSub.setBeginXY(78, 4);
		
		assertEquals(78, lineSub.getBeginX());
		assertEquals(4,  lineSub.getBeginY());
	}
	
	@Test
	public void testSetEndX() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		lineSub.setEndX(74);
		
		assertEquals(74, lineSub.getEndX());
	}
	
	@Test
	public void testSetEndY() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		lineSub.setEndY(41);
		
		assertEquals(41, lineSub.getEndY());
	}

	@Test
	public void testSetEndXY() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		lineSub.setEndXY(81, 43);
		
		assertEquals(81, lineSub.getEndX());
		assertEquals(43,  lineSub.getEndY());
	}
	
	@Test
	public void testGetLength() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		
		assertEquals(39, lineSub.getLength());
	}
	
	@Test
	public void testGetGradient() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		
		assertEquals(0.74, lineSub.getGradient(), 2);
	}
	
	@Test
	public void testToString() {
		Point begin = new Point(32, 36);
		Point end = new Point(5, 7);
		
		LineSub lineSub = new LineSub(begin, end);
		
		assertEquals("Line(32,36) -> (5,7)", lineSub.toString());
	}
}


















