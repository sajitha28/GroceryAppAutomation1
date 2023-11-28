package com.obsqura.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.obsqura.Exception.NoBrowserFoundException;
import com.obsqura.pages.ContactUsPage;
import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.ListProductPage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.LoginPage1;
import com.obsqura.pages.ManageCategoryPage;
import com.obsqura.pages.ManageLocationPage;
import com.obsqura.pages.ManagePaymentMethodsPage;
import com.obsqura.pages.PushNotificationInformationPage;
import com.obsqura.pages.PushNotificationInformationPage2;
import com.obsqura.pages.SearchDeliveryBoyPage;
import com.obsqura.utilities.TestProperties;

public class BaseTest {
	WebDriver driver;
	Properties prop;

	@Parameters({ "browserName" })
	@BeforeClass(alwaysRun = true)
	public void InitializeDriver(@Optional String browserName) throws IOException {
		prop = TestProperties.GetProperties();
		
		if(browserName==null || browserName.isEmpty()) {
		browserName=prop.getProperty("browserName");
		}
		
		String Environment = prop.getProperty("Environment");
		String URL = prop.getProperty(Environment);

		getDriver(browserName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		InitializePages();

	}

	public WebDriver getDriver(String browserName) {
		switch (browserName.toUpperCase()) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		case "EDGE":
			driver = new EdgeDriver();
			break;
		default:
			throw new NoBrowserFoundException("There is no such browser like "+browserName);
		
		}
		return driver;
	}

	public LoginPage loginpage;
	public LoginPage1 loginpage1;
	public HomePage homepage;
	public ExpenseCategoryPage expensecategorypage;
	public ManagePaymentMethodsPage managepaymentmethodpage;
	public ListProductPage listproductpage;
	public PushNotificationInformationPage pushnotificationinformationpage;
	public PushNotificationInformationPage2 pushnotificationinformationpage2;
	public ManageLocationPage managelocationpage;
	public  ContactUsPage contactpage;
	public ManageCategoryPage managecategorypage;
	public SearchDeliveryBoyPage searchdeliveryboypage;
	public void InitializePages() {
		
		loginpage = new LoginPage(driver);
		loginpage1 = new LoginPage1(driver);
		
		homepage = new HomePage(driver);
		expensecategorypage = new ExpenseCategoryPage(driver);
		managepaymentmethodpage = new ManagePaymentMethodsPage(driver);
		listproductpage = new ListProductPage(driver);
		pushnotificationinformationpage= new PushNotificationInformationPage(driver);
		pushnotificationinformationpage2= new PushNotificationInformationPage2(driver);
		managelocationpage= new ManageLocationPage(driver);
		managecategorypage= new  ManageCategoryPage(driver);
		contactpage = new ContactUsPage(driver);
		searchdeliveryboypage = new SearchDeliveryBoyPage(driver);
		
	}

	@AfterClass(alwaysRun = true)
	public void TearDown() {
		driver.quit();
	}
}