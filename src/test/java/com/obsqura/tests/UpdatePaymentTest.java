package com.obsqura.tests;

import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.GenerateRandomNumber;

public class UpdatePaymentTest extends BaseTest{

	@Test
	public void UpdateCreditPayment() throws InterruptedException {
		loginpage.Login();
		Thread.sleep(3000);
		homepage.NavigateToManagePaymentSection();
		Thread.sleep(3000);
		int randomNumber=GenerateRandomNumber.GetRandomNumber();
		managepaymentmethodpage.UpdateCreditDetail(randomNumber);
		Thread.sleep(3000);
	//	up.ValidateCreditDetail( randomNumber);
		String currentDate= DateUtility.getCurrentDate();
		//String ActualNum=up.ValidateCreditisUpdated();
		/**
		 * Perform Validation
		 */
		managepaymentmethodpage.ValidateCreditDetail( randomNumber);
	//	Assert.assertEquals(ActualNum,  randomNumber);
		
	
	}
	}


