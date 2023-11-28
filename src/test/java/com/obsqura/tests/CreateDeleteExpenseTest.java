package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.ExcelUtility;

public class CreateDeleteExpenseTest extends BaseTest {

	
	@Test(groups="Smoke")
	public void ManageExpenseTest() throws InterruptedException {
		String username = ExcelUtility.getString(1,0, "Sheet1");
		String password = ExcelUtility.getString(1,1, "Sheet1");
		System.out.println(username);
		System.out.println(password);
		
	//LoginPage1.LoginSystem(username,password);
	loginpage1.LoginSystem(username,password);
		
		homepage.NavigateToManageExpense();
		Thread.sleep(3000);
		String name = ExcelUtility.getString(1,0, "CreateDeleteExpense");
		String currentDate= DateUtility.getCurrentDate();
		System.out.println(name);
		String alertText = expensecategorypage.CreateExpense(name,currentDate);
		
		/**
		 * Validation for Expense Creation
		 */
		Assert.assertEquals(alertText, "Alert!", "Alert validation failed");
		String deletionText = expensecategorypage.DeleteExpense(name,currentDate);
		/**
		 * Validation for Expense Deletion
		 */
		Assert.assertEquals(deletionText,  "Expense Category Deleted Successfully");
	}
}