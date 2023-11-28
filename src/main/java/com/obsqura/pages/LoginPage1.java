package com.obsqura.pages;



	
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.obsqura.utilities.PageUtility;

	public class LoginPage1 extends PageUtility {

		WebDriver driver;
		public LoginPage1(WebDriver driver) {
			super(driver);
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
		
		//define my locators here
		
		


		@FindBy(xpath="//input[@placeholder='Username']")
		private WebElement userNameField;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		private WebElement passwordField;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement loginBtn;
		
		/*public LoginPage1 enterUsernameOnUserNameTextField(String username)
		{
		
			userNameField.sendKeys(username);
			return this;
			
		}*/
		
		
		/*public void enterUsernameOnUserNameTextField(String username)
		{
		
			//userNameField.sendKeys(username);
			
			
		}*/
		
		/*public LoginPage1 enterPasswordOnPasswordTextField(String password)
		{
		
			passwordField.sendKeys(password);
			return this;
			
		}*/
		/*public void enterPasswordOnPasswordTextField(String password)
		{
		
			passwordField.sendKeys(password);
			//return this;
			
		}*/
		
		/*public LoginPage1 clickOnloginBtn() 		
		{
		
			loginBtn.click();
			return this;
			
		}*/
		//public void clickOnloginBtn() 		
		//{
		
			//loginBtn.click();
			//return this;
			
		
		
		public void LoginSystem(String Username,String Password) 
		{
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			SetTextBox(userNameField,Username );
			SetTextBox(passwordField,Password );
			ClickElement(loginBtn);	
		}

		}


	