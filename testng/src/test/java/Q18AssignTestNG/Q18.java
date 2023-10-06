package Q18AssignTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Util.DriverConnection;

//W.a. TestNG program to use parameterized demo with multiple parameter of Facebook login with TestNG.
public class Q18 {
	@Parameters({"email","pass","login"})
	@Test
	public void login(String email,String pass, String login) {
		WebDriver driver = new DriverConnection().getConnection();
		driver.get("https://www.facebook.com/login/");
		WebElement emailele = driver.findElement(By.id("email"));
		emailele.clear();
		emailele.sendKeys(email);
		WebElement passele = driver.findElement(By.id("pass"));
		passele.clear();
		passele.sendKeys(pass);	
		
		WebElement login1 =driver.findElement(By.id("loginbutton"));
		login1.click();
	}
	
}
