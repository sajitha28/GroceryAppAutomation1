package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class HomePage extends PageUtility
{

	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(),'Manage Expense')]")
	private WebElement manageExpenseBtn;
	

	@FindBy(xpath="//p[normalize-space()='Expense Category']")
	private WebElement expenseCategory;
	
	@FindBy(xpath="//p[normalize-space()='Manage Payment Methods']")
	private WebElement managePaymentMethods;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]//p[contains(text(),'Manage Product')]")
	private WebElement manageProduct;
	@FindBy(xpath="//i[@class='nav-icon fas fa-fas fa-bell']")
	private WebElement PushNotif;
	@FindBy(xpath = "//a[contains(@class,'nav-link')]//p[contains(text(),'Manage Location')]")
	private WebElement ManageLocation;
	@FindBy(xpath = "//a[contains(@class,'nav-link')]//p[contains(text(),'Manage Category')]")
	private WebElement ManageCategory;
	@FindBy(xpath = "//a[contains(@class,'nav-link')]//p[contains(text(),'Manage Delivery Boy')]")
	private WebElement SearchDeliveryBoy;
	
	@FindBy(xpath = "//li[@class='nav-item has-treeview menu-open']//ul[1]//li[1]//a[1]")
			private WebElement Category;
	//nav nav-treeview
	//li[@class='nav-item has-treeview menu-open']//ul[1]//li[1]//a[1]

	@FindBy(xpath="//*[contains(text(),'Manage Content')]")
	private WebElement manageContent ;
	//@FindBy(xpath="//i[@class='far fa-circle nav-icon']")
	@FindBy(xpath="//*[contains(text(),'Manage Contact')]")
	private WebElement manageContact;
	
	//@FindBy(xpath="//*[contains(text(),'Manage Contact')]")
	//private WebElement manageContact;
	//@FindBy(xpath="//*[contains(text(),'Sub Category')]")
	//private WebElement Category;
	
	public void NavigateToManageExpense() {
		ClickElement(manageExpenseBtn);
		ClickElement(expenseCategory);

	}
	/*public void NavigateToManageCategory()
	{
		ClickElement(CategoryBtn);
		ClickElement(SubCategoryBtn);
	}*/
	public void NavigateToManagePaymentSection() {
		ClickElement(managePaymentMethods);
	}
	
	public void NavigateToManageProductSection() {
		ClickElement(manageProduct);
	}
	public void NavigateToPushNotifSection()
	{
		ClickElement(PushNotif);
	}
	
	public void NavigateToManageLocationSection()
	{
		ClickElement(ManageLocation);
	}
	public void NavigateToManageContact() {
		ClickElement(manageContent);
		ClickElement(manageContact);
	}
	public void NavigateToManageCategory()
	{
		ClickElement(ManageCategory);
		ClickElement(Category);
	}
	public void NavigateToSearchDeliveryBoy()
	{
		ClickElement(SearchDeliveryBoy);
		
	}
}
