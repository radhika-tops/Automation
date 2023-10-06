package CrossBrowserTops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Util.DriverConnection;

public class PersonalDetails {
	
	@Test
	public void studentsdetails () {
		WebDriver driver = new DriverConnection().getConnection();
		driver.get("https://careercenter.tops-int.com/");
		WebElement ele = driver.findElement(By.xpath("(//i[@class='fa-solid fa-angle-down mx-md-2 me-2'])[1]"));
		ele.click();
	}

}