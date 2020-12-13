package tests;
	import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.inject.spi.Message;

import pages.RegistrationPage;

	
	public class RegistrationTest extends TestBase {
 {
/*	 @BeforeTest
	 public void OpenBrowser ()
	 {
		 OpenURL() ;
	 }
*/	 
 }
		
		@Test
		public void UserCanRegisterSuccessful ()
		{
			
			RegistrationPage RegObj = new RegistrationPage(driver) ;
			RegObj.RegistrationMethod("mina", "shawky" , "mina@mailinator.com" , "mina@mailinator.com" , "minashawky" , "123456" , "16/02/1992");
			WebElement Message = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div")) ;
			assertEquals(Message.getText(), "User is successfully Register. Now You can Login");


}}
	
