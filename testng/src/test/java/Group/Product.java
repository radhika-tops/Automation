package Group;

import org.testng.annotations.Test;

public class Product {
	@Test(groups = "smoke")
	public void searchProduct() {
		System.out.println("search product");
	}
	@Test (groups = {"purchase","smoke"})
	public void addtocart() {
		System.out.println("add to cart");
	}
	@Test
	public void addtowishlist() {
		System.out.println("add to wishlist");
	}
}
