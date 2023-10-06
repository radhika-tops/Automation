package Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.DriverConnection;

public class FBParametersLogin {
	static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser() {
		driver = new DriverConnection().getConnection();
		driver.get("https://www.facebook.com/login/");
	}
	
	@Test(dataProvider = "dp")
	public void test (String email, String pass) {
		WebElement emailele = driver.findElement(By.id("email"));
		emailele.clear();
		emailele.sendKeys(email);
		WebElement passele = driver.findElement(By.id("pass"));
		passele.clear();
		passele.sendKeys(email);
	}
	@DataProvider(name="dp")
	public static Object[][]dataProviderMethod(){
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "coorect@gmail.com";
		obj[0][1] = "corectt56";
		
		obj[1][0] = "inccoorect@gmail.com";
		obj[1][1] = "corectt56";
		
		return obj;
		
	}
	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}

}
