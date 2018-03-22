package softwareTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangleProblemTest {
	
	public triangleProblem tri ;

	@Test
	 public void testEquilateral() {

	    tri = new triangleProblem();

	    assertEquals("equilateral",tri.equilateral(5, 5, 5));
	    assertEquals("equilateral",tri.equilateral(7, 7, 7));
	    assertEquals("equilateral",tri.equilateral(10, 10, 10));

	    }
	@Test
		public void testIsosceles() {
		
		tri = new triangleProblem();
		
		assertEquals("isosceles",tri.isosceles(4,4,5));
		assertEquals("isosceles",tri.isosceles(6,6,3));
		assertEquals("isosceles",tri.isosceles(8,8,1));
		
	}
	
	@Test
	public void testScalene() {
	
	tri = new triangleProblem();
	
	assertEquals("scalene",tri.scalene(3,4,5));
	assertEquals("scalene",tri.scalene(5,6,3));
	assertEquals("scalene",tri.scalene(7,8,2));
	
}
	

}
