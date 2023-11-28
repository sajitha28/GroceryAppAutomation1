package com.obsqura.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;
import com.obsqura.pages.PushNotificationInformationPage;
import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.ExcelUtility;
public class CreateNotificationAlertTest2 extends BaseTest
{
	
	@Test
	public void PushNotification2 ()
	{
		String username = ExcelUtility.getString(1,0, "Sheet1");
		String password = ExcelUtility.getString(1,1, "Sheet1");
		System.out.println(username);
		System.out.println(password);
		
	//LoginPage1.LoginSystem(username,password);
	loginpage1.LoginSystem(username,password);
		//loginpage1.LoginSystem());
		
		homepage.NavigateToPushNotifSection();
		String name = ExcelUtility.getString(0,0, "Notification");
		String currentDate= DateUtility.getCurrentDate();
		System.out.println(name);
		String depiction = ExcelUtility.getString(0,1, "Notification");
		//String currentDate= DateUtility.getCurrentDate();
		//String currentDate= DateUtility.getCurrentDate();
		String alertngText = pushnotificationinformationpage2.NotificationAlert2(currentDate, name,depiction);
	//	pushnotificationinformationpage.NotificationAlert();
		
		/**
		 * Validation for Expense Creation
		 */
		//Assert.assertEquals(alertMsg,"Alert!");
		Assert.assertEquals(alertngText,"Message send successfully","Alert!");
	//Assert.assertEquals(alertText, "Alert!", "Alert validation failed");
		//String deletionText = ecp.DeleteExpense(currentDate);
		//listproductpage.PushNotification(GetProductName());
		//String actualName = listproductpage.validateProductExists();
}

	}
