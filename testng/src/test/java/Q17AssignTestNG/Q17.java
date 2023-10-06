package Q17AssignTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Util.DriverConnection;

//W.a. TestNG program to check gmail login using with @beforetest,@aftertest,@Test
public class Q17 {
static WebDriver driver;
	
	@BeforeTest
	public static void openBrowser() {
		driver = new DriverConnection().getConnection();
		driver.get("https://accounts.google.com/");
	}

	@Test
	public void logintest () {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
//		driver.findElement(By.name("pass")).sendKeys("1234shjd");
//		driver.findElement(By.name("login")).click();

	}
//	@After
//	public static void afterClass() {
//		driver.close();
//	}
}
