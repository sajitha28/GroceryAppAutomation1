package com.obsqura.pages;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.obsqura.utilities.PageUtility;

	public class ManageCategoryPage extends PageUtility {

		WebDriver driver;

		public ExpenseCategoryPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
		private WebElement newBtn;
		
		@FindBy(xpath = "//input[@id='name']")
		private WebElement title;

		@FindBy(xpath = "//button[@name='Create']")
		private WebElement saveBtn;

		@FindBy(xpath = "//h5[normalize-space()='Alert!']")
		private WebElement alertText;
}
