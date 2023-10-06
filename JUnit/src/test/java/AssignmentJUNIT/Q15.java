package AssignmentJUNIT;


import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.DriverConnection;


//W.a. junit program to use parameterized demo with multiple parameter of Facebook login in junit.
@RunWith(Parameterized.class)
public class Q15 {
	String email;
	String pass;
	static WebDriver driver;//before class
	public Q15(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;

	}
	
	static String url = "https://www.facebook.com/";
	@BeforeClass
	public static void beforeClass() {
		driver = new DriverConnection().getConnection();
	driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void logintest() {
		WebElement emailE = driver.findElement(By.id("email"));
		emailE.clear();
		emailE.sendKeys(email);
		WebElement passE = driver.findElement(By.id("pass"));
		passE.clear();
		passE.sendKeys(pass);
	}
//	@After
//	public void after() {
//		driver.close();
//	}
	
	@Parameters
	public static List<Object[]> passData() {
		
		Object o[][] = new Object[4][2];
		o[0][0] = "correct@gmail.com";
		o[0][1] = "correct@123";
		
		o[1][0] = "incorrect@gmail.com";
		o[1][1] = "correct@123";
		
		o[2][0] = "correct@gmail.com";
		o[2][1] = "incorrect@123";
		
		o[3][0] = "incorrect@gmail.com";
		o[3][1] = "incorrect@123";
		
		return Arrays.asList(o);
	}
}
