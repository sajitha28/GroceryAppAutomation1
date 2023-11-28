package com.obsqura.pages;


	import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

	public class ManageCategoryPage extends PageUtility {

		WebDriver driver;

		public ManageCategoryPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
		private WebElement newBtn;
		
		@FindBy(xpath = "//input[@id='category']")
		private WebElement Category;
		
		//@FindBy(xpath = "//div[@class=' form-group']//input[@id='main_img']")
		
		
		
		//WebElement fileInput = driver.findElement(By.id("main_img")); // Replace with the actual ID
	       

		@FindBy(xpath = "//button[@class='btn btn-danger']")
		private WebElement saveBtn;

		@FindBy(xpath = "//h5[normalize-space()='Alert!']")
		private WebElement AlertMsg;
		
		
		//upload_button=driver.find_element_by_id("main_img");
		
		
		public void ManageCategory() 
		{
			ClickElement(newBtn);
			String name = "CHOCALATE";
			
			SetTextBox(Category, name );
			By locator=By.xpath("//input[@id='main_img']");
			
			 String path = "C:\\Users\\sajit\\OneDrive\\Desktop\\CHOCALATE";
			PageUtility.uploadFile(locator, path);
			ClickElement(saveBtn);
			// fileInput.sendKeys(filePath);
			 
			
			//String AlertText = GetElemenText(AlertMsg);
			//System.out.println(AlertText.split("Alert!")[1].trim());
			//return AlertText.split("Alert!")[1].trim();
			
		}
		
	
}
	
