package com.obsqura.tests;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.obsqura.pages.LoginPage1;
//import com.obsqura.utilities.ExcelReaderUtility;
import com.obsqura.utilities.ExcelUtility;

public class CreateContact extends BaseTest {

	@Test
	public void CreateContactTest() throws IOException, InterruptedException {
		String username = ExcelUtility.getString(1,0, "Sheet1");
		String password = ExcelUtility.getString(1,1, "Sheet1");
		System.out.println(username);
		System.out.println(password);
		
	//LoginPage1.LoginSystem(username,password);
	loginpage1.LoginSystem(username,password);
	homepage.NavigateToManageContact();
	//Thread.sleep(2000);
	String  phone =ExcelUtility.getNumeric(1,0, "CreateContact");
//	
	String Phone = String.valueOf(phone);
	String emailAddress = ExcelUtility.getString(1,1, "CreateContact");
	String Address = ExcelUtility.getString(1,2, "CreateContact");
	String deliverytime = ExcelUtility.getNumeric(1,3, "CreateContact");
	String DeliveryTime = String.valueOf(deliverytime);
	String deliverychargeLimit = ExcelUtility.getNumeric(1,4, "CreateContact");
	String DeliveryChargeLimit= String.valueOf(deliverychargeLimit);
	System.out.println(emailAddress);
	System.out.println(Address);
	System.out.println(deliverytime);
	System.out.println(deliverychargeLimit);
	
	
		
		/**
		 * Assertion or make validation
		 */
	String alertText=contactpage.enterDataOnContactUsPageFields(Phone,emailAddress,Address, DeliveryTime,DeliveryChargeLimit);
	//Assert.assertEquals(alertText,"Contact UpdatedSucessfully","Contact update validation failed");
	}
}