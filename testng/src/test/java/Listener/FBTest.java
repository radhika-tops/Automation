package Listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import Util.DriverConnection;

public class FBTest {
	
	@Test
	public void titleTest(ITestContext i) {
		WebDriver driver = new DriverConnection().getConnection();
		driver.get("https://www.facebook.com/login/");
		i.setAttribute("myDriver", driver);
		assertEquals(driver.getTitle(), "FB");
}
}
