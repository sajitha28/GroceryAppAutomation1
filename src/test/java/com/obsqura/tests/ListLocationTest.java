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
			lp.Login();
			hp.NavigateToManageLocationSection();
			//String currentDate= DateUtility.getCurrentDate();
			//String currentDate= DateUtility.getCurrentDate();
			String alertMsg = mlp.SearchRegion();
		
			
			/**
			 * Validation forLocation  Creation
			 */
			Assert.assertEquals(alertMsg, "Alert!", "Location Created Successfully");
			
	}

		}


