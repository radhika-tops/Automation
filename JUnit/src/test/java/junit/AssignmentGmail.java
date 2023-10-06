package junit;
//W.a. junit program to check gmail login using with @before,@after,@Test

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignmentGmail {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		driver = new DriverConnection().getConnection();
		driver.get("https://accounts.google.com/");
	}
//	@AfterClass
//	public static void afterClass() {
//		driver.close();
//	}
	@Test
	public void loginTest() {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
//		driver.findElement(By.name("pass")).sendKeys("1234shjd");
//		driver.findElement(By.name("login")).click();
	}
}
