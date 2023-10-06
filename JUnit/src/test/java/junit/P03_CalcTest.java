package junit;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class P03_CalcTest {
			@Test
			public void calc() {
				Calc c = new Calc();
				int actual = c.addition(12, 12);
				int expected = 25;
				assertEquals(expected, actual);
			}
			
			
			@Test
			public void calctest2() {
				Calc c = new Calc();
				int actual = c.subtraction(12, 12);
				int expected = 0;
				assertEquals(expected, actual);
			}
			
			
			@Test
			public void calctest3() {
				Calc c = new Calc();
				double actual = c.division(12, 6);
				double expected = 2;
				double delta = 0;
				assertEquals(expected, actual,delta);
			}
			
}
