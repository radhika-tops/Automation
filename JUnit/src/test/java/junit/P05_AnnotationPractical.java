package junit;

import static org.junit.Assert.assertEquals;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class P05_AnnotationPractical {
		static WebDriver driver;
		static String url = "https://www.facebook.com/";
		@BeforeClass
		public static void beforeClass() {
			driver = new DriverConnection().getConnection();
			
			
		}
		@AfterClass
		public static void afterClass() {
			driver.close();
		}
		@Test
		public void titleTest() {
			assertEquals("Facebook Login", driver.getTitle());
		}

}
