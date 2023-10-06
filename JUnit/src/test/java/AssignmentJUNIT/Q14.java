package AssignmentJUNIT;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.DriverConnection;

//W.a. junit program to check gmail login using with @before,@after,@Test
public class Q14 {
	static WebDriver driver;
	@Before
	public void before() {
		driver = new DriverConnection().getConnection();
		driver.get("https://accounts.google.com/");
	}
//	@After
//	public void after() {
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
