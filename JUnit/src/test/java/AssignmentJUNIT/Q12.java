package AssignmentJUNIT;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.Calc;



//W.a.junit program to handled Assert class with all method to check its pass or fail
public class Q12 {
	
	@Test
	public void assertEqualsTest()
	{
		Calc c = new Calc();
		int sum = c.addition(2, 2);
		
		assertEquals(2, sum); //Test failed as expected value is not equal to actual value.
		
	}
	@Test
	public void assertNotEqualsTest()
	{
		Calc c = new Calc();
		int sum = c.addition(2, 2);
		
		assertNotEquals(2, sum); //Test passed as expected value is not equal to actual value.
		
	}
	@Test
	public void assertArrayEqualsTest()
	{
		//assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3}); //test passed
		//assertArrayEquals(new int[] {1,2,3}, new int[] {1,3,2}); //test failed (index error)due sequence of numbering mismatch.
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3,4}); //test failed due element mismatch.
		
	}
	@Test
	public void assertNullTest()
	{
		String nullString = null;
		String notNullString = "JUnit";//test failed due to JUnit mentioned.
		assertNull(notNullString);
		
		
	}
	@Test
	public void assertNotNullTest()
	{
		String nullString = null;
	//	assertNull(nullString);
		
		String notNullString = "JUnit"; 
		assertNotNull(nullString);
	}
	@Test
	public void assertTrueTest()
	{
		boolean trueValue = true;
		boolean falseValue = false;
		assertTrue(trueValue);
	}
	@Test
	public void assertFalseTest()
	{
		boolean trueValue = true;
		boolean falseValue = false;
		assertFalse(falseValue);
	}
	
	
	
}
