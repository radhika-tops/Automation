package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {
	@Parameters("browser")
	@Test
	public void test (String browser) {
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\WebDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\baps\\Downloads\\WebDriver\\geckodriver-v0.33.0-win64(1)\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\baps\\Downloads\\WebDriver\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com/");
	}
}
