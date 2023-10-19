package com.obsqura.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;
import com.obsqura.pages.PushNotificationInformationPage;
import com.obsqura.utilities.DateUtility;
public class CreateNotificationAlertTest extends BaseTest
{
	
	@Test
	public void PushNotification ()
	{
		lp.Login();
		hp.NavigateToPushNotifSection();
		//String currentDate= DateUtility.getCurrentDate();
		String currentDate= DateUtility.getCurrentDate();
		String alertMsg = pnp.NotificationAlert(currentDate);
	//	pnp.NotificationAlert();
		
		/**
		 * Validation for Expense Creation
		 */
		//Assert.assertEquals(alertMsg,"Alert!");
		Assert.assertEquals(alertMsg,"Alert!","\nMessage send successfully");
		//String deletionText = ecp.DeleteExpense(currentDate);
		//lpp.PushNotification(GetProductName());
		//String actualName = lpp.validateProductExists();
}

	}
