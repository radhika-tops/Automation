package junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class P02_Assert {
	@Test
	public void test() {
//		assertEquals(10,11);
//		assertFalse(false);
//		assertFalse(true);
//		assertTrue(true);
//		assertTrue(false);
		
		int a[] = {1,2,3,4,5,6};
		int b[]=  {1,2,3,4,5,6};
		assertArrayEquals(a, b);
		
	}

}
