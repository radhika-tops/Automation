package Q19AssignTestNG;

import org.testng.annotations.Test;

//W.a. TestNG program to create group with testing.xml file
public class Q19User {
	@Test
	public void register() {
		System.out.println("Registration");
	}
	@Test(groups = "purchase")
	public void login() {
		System.out.println("Login");
	}
	@Test
	public void profile() {
		System.out.println("profile");
	}
	
}
