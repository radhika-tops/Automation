package CrossBrowserTops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Util.DriverConnection;

public class Home {
	@Parameters({"mob","pass"})
	@Test
	public void login(String mob,String pass) {
		WebDriver driver = new DriverConnection().getConnection();
		driver.get("https://careercenter.tops-int.com/");
		WebElement mobele = driver.findElement(By.id("mobile"));
		mobele.clear();
		mobele.sendKeys(mob);
		WebElement passele = driver.findElement(By.id("password"));
		passele.clear();
		passele.sendKeys(pass);
		WebElement loginele = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		loginele.click();
		WebElement ele = driver.findElement(By.xpath("(//i[@class='fa-solid fa-angle-down mx-md-2 me-2'])[1]"));
		ele.click();
		
	}

	}


