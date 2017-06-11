package crossBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle_CrossBrowsers {
	
	WebDriver driver;

	@Parameters("browser")
	@Test
	public void verifyPageTitle(String browserName) {
		
		if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","V:\\seleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "V:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "V:\\SeleniumJars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
}
}	