package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.collect.ObjectArrays;

@RunWith(Parameterized.class)
public class P07_Parameterized {
	int a;
	int b;
	int result;
	
	
	public P07_Parameterized(int a, int b, int result) {
		this.a = a;
		this.b = b;
		this.result = result;
		
	}
	@Test
	public void test() {
		Calc c = new Calc();
		int actual = c.addition(a, b);
		int expected = result;
		assertEquals(expected, actual);
	}
	@Parameters
	public static Object[][] passData(){
		Object o[][] = new Object[4][3];
		
		o[0][0] = 1;
		o[0][1] = 2;
		o[0][2] = 3;
		
		o[1][0] = 5;
		o[1][1] = 6;
		o[1][2] = 10;
		
		o[2][0] = 11;
		o[2][1] = 10;
		o[2][2] = 21;
		
		o[3][0] = 20;
		o[3][1] = 14;
		o[3][2] = 35;
		return o;
	}
	

}
