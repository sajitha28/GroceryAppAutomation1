package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class PushNotificationInformationPage extends PageUtility{
	WebDriver driver;

	public PushNotificationInformationPage(WebDriver driver)  {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// define my locators here
	@FindBy(xpath="//p[normalize-space()='Push Notifications']")
	private WebElement pushNotification;
	@FindBy(xpath="//input[@id='title']")
	private WebElement title;
	@FindBy(xpath="//input[@id='description']")
	private WebElement description;
	@FindBy(xpath="//button[@name='create']")
	private WebElement send;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement AlertMsg;

	
	
	public String NotificationAlert(String currentDate) {
		String name = "Obsqura";
		
		SetTextBox(title, name + currentDate);
		
		String depiction = "college";

		
		SetTextBox(description,depiction + currentDate);
		ClickElement(send);
		return GetElemenText(AlertMsg);

	}



	






}

