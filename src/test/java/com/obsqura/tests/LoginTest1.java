package com.obsqura.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage1;
import com.obsqura.utilities.ExcelUtility;
@Test(groups={"smoke"})
public class LoginTest1  extends BaseTest{
	@Test
public void verifyUserIsAbleToLoginWithCorrectUserNameAndPassword() {
		
	String username = ExcelUtility.getString(1,0, "Sheet1");
	String password = ExcelUtility.getString(1,1, "Sheet1");
	System.out.println(username);
	System.out.println(password);
	
	//loginpage1 = new LoginPage1(driver);*/
	/*loginpage1.enterUsernameOnUserNameTextField(username);
	loginpage1.enterPasswordOnPasswordTextField(password);
	loginpage1.clickOnloginBtn();*/
	
	loginpage1.LoginSystem(username,password);
	/*
	String name =ExcelUtility.getString(1,0, "Notification") ;
	String depiction =ExcelUtility.getString(1,1, "college");*/
	
	//boolean actualValue = loginpage1.IsDisplayedDashboardTextOnHomePage();
	//assertTrue(actualValue, "User is unable to Login");
}
}
