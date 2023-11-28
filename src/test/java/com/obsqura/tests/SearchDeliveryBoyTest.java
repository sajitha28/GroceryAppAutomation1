package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.SearchDeliveryBoyPage;
import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.ExcelUtility;

public class SearchDeliveryBoyTest extends BaseTest {
	@Test
	public void TestSearchDeliveryBoy ()
	{

		String username = ExcelUtility.getString(1,0, "Sheet1");
		String password = ExcelUtility.getString(1,1, "Sheet1");
		System.out.println(username);
		System.out.println(password);
		
	//LoginPage1.LoginSystem(username,password);
	loginpage1.LoginSystem(username,password);
		//loginpage1.LoginSystem());
	homepage.NavigateToSearchDeliveryBoy();
		
		String name = ExcelUtility.getString(0,0, "SearchDeliveryBoy");
	
		System.out.println(name);
		String email = ExcelUtility.getString(0,1, "SearchDeliveryBoy");
		System.out.println(email);
		String phonenum = ExcelUtility.getNumeric(0,2, "SearchDeliveryBoy");
		System.out.println(phonenum);
		
	
		//String currentDate= DateUtility.getCurrentDate();
		//String currentDate= DateUtility.getCurrentDate();
	
	String phnum = String.valueOf(phonenum);
	searchdeliveryboypage.ManageDeliveryBoy(name,email,phnum);
	//searchdeliveryboypage.ManagePhone(phnum);
	//	pushnotificationinformationpage.NotificationAlert();
		
		/**
		 * Validation for Expense Creation
		 */
		//Assert.assertEquals(alertMsg,"Alert!");
	//	Assert.assertEquals(alertngText,"Message send successfully","Alert!");
	//Assert.assertEquals(alertText, "Alert!", "Alert validation failed");
		//String deletionText = ecp.DeleteExpense(currentDate);
		//listproductpage.PushNotification(GetProductName());
		//String actualName = listproductpage.validateProductExists();
}

	

	}

