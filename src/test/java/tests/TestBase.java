package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver ;
  

	@BeforeSuite
	public void Openfirefox () 
	 {
			{
				System.setProperty("webdriver.gecko.driver" ,  System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe") ;
		 driver = new FirefoxDriver();
				driver.navigate().to("https://www.performancetestingpractice.com/register.php");
			}
	 }}