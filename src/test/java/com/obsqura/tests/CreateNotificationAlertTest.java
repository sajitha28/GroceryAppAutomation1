package com.obsqura.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;
import com.obsqura.pages.PushNotificationInformationPage;
import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.ExcelUtility;
public class CreateNotificationAlertTest extends BaseTest
{
	
	@Test
	public void PushNotification ()
	{
		String username = ExcelUtility.getString(1,0, "Sheet1");
		String password = ExcelUtility.getString(1,1, "Sheet1");
		System.out.println(username);
		System.out.println(password);
		
	//LoginPage1.LoginSystem(username,password);
	loginpage1.LoginSystem(username,password);
		homepage.NavigateToPushNotifSection();
		
		//String currentDate= DateUtility.getCurrentDate();
		String currentDate= DateUtility.getCurrentDate();
		String alertngText = pushnotificationinformationpage.NotificationAlert(currentDate);
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
