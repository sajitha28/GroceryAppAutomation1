package com.obsqura.pages;


	

	import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.obsqura.constants.Constants;
	import com.obsqura.utilities.PageUtility;

	public class ManageLocationPage extends PageUtility {

		WebDriver driver;

		public ManageLocationPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		// define my locators here
		By locator = By.xpath("write your xpath here");

		//@FindBy(xpath = "//a[contains(@class,'nav-link')]//p[contains(text(),'Manage Location')]")
		//private WebElement manageLocation;

		@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']//i[@class='fas fa-edit']")
		private WebElement NewBtn;

		@FindBy(xpath = "//select[@id='country_id']")
		private WebElement Country;

		@FindBy(xpath = "//select[@class='form-control selectpicker']")
		private WebElement State;
		
		@FindBy(xpath = "//input[@id='location']")
		private WebElement Location;
		
		@FindBy(xpath = "//input[@id='delivery']")
		private WebElement DeliveryCharge;
		@FindBy(xpath = "//button[@name='create']")
		private WebElement save;
		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement AlertMsg;
		//*[@id="st_id"]/option[9]
	//"(//select[@id='st_id'])[1]//option[9]//a")).click();

		public String SearchRegion() {
			ClickElement(NewBtn);
			driver.findElement(By.xpath("//select[@id='st_id']")).sendKeys("Bir");
		    List<WebElement> states = driver.findElements(By.xpath("//*[@id=\"st_id\"]/option[9]"));
	        System.out.println(states.size());
	        for(int i =0; i<states.size();i++) {
	        	if(states.get(i).getText().equalsIgnoreCase("Birmingham")) {
	        		states.get(i).click();
	        		break;
	        	}
	        }
			//String Ctry = "United Kingdom";
			//SetTextBox(Country,Ctry  );
			//String sta = "Birmingham";
			//SetTextBox(State,sta  );
			String Loc="London";
			SetTextBox(Location,Loc );
			String DelChar="50";
			SetTextBox(DeliveryCharge,DelChar);
			ClickElement(save);
			String AlertText = GetElemenText(AlertMsg);
			System.out.println(AlertText.split("Alert!")[1].trim());
			return AlertText.split("Alert!")[1].trim();
			//eturn GetElemenText(AlertMsg);
		}

	

	}

