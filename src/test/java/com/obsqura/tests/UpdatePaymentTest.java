package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.GenerateRandomNumber;
import com.obsqura.utilities.TestProperties;

public class UpdatePaymentTest extends BaseTest{

	@Test
	public void UpdateCreditPayment() throws InterruptedException {
		lp.Login();
		Thread.sleep(3000);
		hp.NavigateToManagePaymentSection();
		Thread.sleep(3000);
		int randomNumber=GenerateRandomNumber.GetRandomNumber();
		up.UpdateCreditDetail(randomNumber);
		Thread.sleep(3000);
	//	up.ValidateCreditDetail( randomNumber);
		String currentDate= DateUtility.getCurrentDate();
		//String ActualNum=up.ValidateCreditisUpdated();
		/**
		 * Perform Validation
		 */
		up.ValidateCreditDetail( randomNumber);
	//	Assert.assertEquals(ActualNum,  randomNumber);
		
	
	}
	}


