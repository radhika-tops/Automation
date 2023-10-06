package Q16AssignTestNG;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Util.DriverConnection;

//W.a. TestNG program to perform test with webdriver to login process of facebook
public class Q16 {

	@Test
	public void test () {
		WebDriver driver= new DriverConnection().getConnection();
		driver.get("https://www.facebook.com/login/");
		WebElement eml=  driver.findElement(By.id("email"));
		eml.sendKeys("shfuy4556@gmail.com");
		WebElement pass=  driver.findElement(By.id("pass"));
		pass.sendKeys("fri563ff");
		WebElement logn=  driver.findElement(By.id("loginbutton"));
		logn.click();

	}
}
