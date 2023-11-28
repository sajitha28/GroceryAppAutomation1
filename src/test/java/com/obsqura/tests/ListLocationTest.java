package com.obsqura.tests;


	
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import java.io.IOException;

	import org.testng.annotations.Test;
	import com.obsqura.pages.ManageLocationPage;
	import com.obsqura.utilities.DateUtility;
	public class  ListLocationTest extends BaseTest
	{
		
		@Test
		public void ListLocation ()
		{
			loginpage.Login();
			homepage.NavigateToManageLocationSection();
			//String currentDate= DateUtility.getCurrentDate();
			//String currentDate= DateUtility.getCurrentDate();
			String alertMsg = managelocationpage.SearchRegion();
		
			
			/**
			 * Validation forLocation  Creation
			 */
			Assert.assertEquals(alertMsg, "Location Created Successfully", "Alert!");
			
	}

		}


