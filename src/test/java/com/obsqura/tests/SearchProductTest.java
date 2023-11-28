package com.obsqura.tests;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;

public class SearchProductTest extends BaseTest {

	@Test(groups="Smoke")
	public void SearchProduct() throws IOException {
		loginpage.Login();
		homepage.NavigateToManageProductSection();
		listproductpage.SearchProduct(GetProductName());
		System.out.println(GetProductName());
		String actualName = listproductpage.validateProductExists();
		System.out.println(actualName);
		/**
		 * Validation
		 */
		Assert.assertEquals(actualName, GetProductName());
		Assert.fail();

	}
	


	public String GetProductName() throws IOException {
		return TestProperties.GetProperties().getProperty("productName");
	}
}