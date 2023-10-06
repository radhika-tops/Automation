package Q19AssignTestNG;

import org.testng.annotations.Test;

public class Q19Order {
	@Test(groups = "purchase")
	public void searchorder() {
		System.out.println("search order");
	}
	@Test(groups = "purchase")
	public void Addtocart() {
		System.out.println("Add to cart");
	}
	@Test(groups = "purchase")
	public void Viewcart() {
		System.out.println("view order from cart");
	}
	@Test
	public void searchdiscount() {
		System.out.println("search discounts on order");
	}
}
