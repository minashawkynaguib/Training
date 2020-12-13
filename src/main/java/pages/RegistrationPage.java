package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends PageBase {
	
		public RegistrationPage(WebDriver driver) {
		super(driver);
	}

		 {

		}
		@FindBy ( name = "first_name") 
		WebElement first_name_txt ;


		@FindBy (name = "last_name")
		WebElement last_name_txt ;
		
		@FindBy (name = "fld_email")
		WebElement email_txt ;
		

		@FindBy (name = "fld_cemail")
		WebElement Confirm_email_txt ;
		
		@FindBy (name = "fld_username")
		WebElement Username_txt ;
		
		@FindBy (name = "fld_password")
		WebElement password_txt ;
		
		@FindBy (name = "dob")
		WebElement BirthDay_txt ;
		
		@FindBy (name = "phone")
		WebElement PhoneNumber_txt ;
		
		
		@FindBy (name = "address")
		WebElement address_txt ;
		
		
		@FindBy (name = "city")
		WebElement city_txt ;
		
		
		@FindBy (name = "state")
		WebElement state_txt ;
		
		
		@FindBy (name = "zip")
		WebElement zip_txt ;
		
		
		@FindBy (xpath = "//*[@id=\"contact_form\"]/fieldset/div[14]/div/button")
		WebElement SubmitButton ;
		
	

public void RegistrationMethod (String firstName , String lastName , String email , String Cemail , String userName , String password , String birthday) 
{
first_name_txt.sendKeys(firstName);	
last_name_txt.sendKeys(lastName);
email_txt.sendKeys(email);
Confirm_email_txt.sendKeys(Cemail);
Username_txt.sendKeys(userName);
password_txt.sendKeys(password);
BirthDay_txt.sendKeys(birthday);

SubmitButton.click();




}


	
		
}
