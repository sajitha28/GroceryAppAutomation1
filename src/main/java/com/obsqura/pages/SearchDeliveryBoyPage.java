package com.obsqura.pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.obsqura.utilities.PageUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchDeliveryBoyPage extends PageUtility {
	WebDriver driver;

	public SearchDeliveryBoyPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
		private WebElement SearchBtn;
		
		@FindBy(xpath = "//input[@id='un']")
		private WebElement Name;
		
		@FindBy(xpath = "//input[@id='ph']")
		private WebElement  PhNumber;
		
		@FindBy(xpath = "//input[@id='ut']")
		private WebElement  EmailId;
		
		@FindBy(xpath = "//i[@class='fa fa-search']")
		private WebElement  Search;
		
		
		
	


		public void ManageDeliveryBoy(String name,String email, String phnum) 
		{
			ClickElement(SearchBtn);
			
			
			SetTextBox(Name, name);
			
		
			SetTextBox(EmailId, email);
			SetTextBox(PhNumber,phnum);
			
		//	SetTextBox(Phnum, PhNumber + currentDate);
			
			 ClickElement(Search);
			
			
			
		}
	}

