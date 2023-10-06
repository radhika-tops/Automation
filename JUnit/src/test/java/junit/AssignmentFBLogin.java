package junit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignmentFBLogin {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		driver = new DriverConnection().getConnection();
		driver.get("https://www.facebook.com/");
	}
//	@AfterClass
//	public static void afterClass() {
//		driver.close();
//	}
	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("abcd34@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234shjd");
		driver.findElement(By.name("login")).click();
	}
}
