package Q19AssignTestNG;

import org.testng.annotations.Test;

public class Q19Payment {
	@Test (groups = "purchase")
	public void COD() {
		System.out.println("COD payment");
	}
	@Test
	public void DebitCard() {
		System.out.println("debit card");
	}
	@Test 
	public void CreditCard() {
		System.out.println("credit card");
	}
	@Test
	public void UPI() {
		System.out.println("UPI");
	}
}
