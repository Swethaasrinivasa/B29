package Mar1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	@Test
	public void testA() {
		WebDriverManager.chromedriver().setup();  // to setup the driver executable which is present in maven dependecies
	//	WebDriverManager.chromedriver().browserVersion("97").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();
		
		
	}
}
