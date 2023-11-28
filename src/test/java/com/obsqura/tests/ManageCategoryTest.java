package com.obsqura.tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;
import com.obsqura.pages.ManageCategoryPage;
import com.obsqura.utilities.DateUtility;


public class ManageCategoryTest extends BaseTest {
	
		
		@Test
		public void TestCategory () throws AWTException
		{
			loginpage.Login();
			homepage.NavigateToManageCategory();
			//String currentDate= DateUtility.getCurrentDate();
			//String currentDate= DateUtility.getCurrentDate();
			 managecategorypage.ManageCategory();
			//managecategorypage.uploadFile();
		//	pushnotificationinformationpage.NotificationAlert();
			
			/**
			 * Validation for Expense Creation
			 */
			//Assert.assertEquals(alertMsg,"Alert!");
			//Assert.assertEquals(alertngText,"Message send successfully","Alert!");
		//Assert.assertEquals(alertText, "Alert!", "Alert validation failed");
			//String deletionText = ecp.DeleteExpense(currentDate);
			//listproductpage.PushNotification(GetProductName());
			//String actualName = listproductpage.validateProductExists();
	}

		}


