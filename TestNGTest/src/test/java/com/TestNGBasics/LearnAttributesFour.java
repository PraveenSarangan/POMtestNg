package com.TestNGBasics;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class LearnAttributesFour {
	@Test	(enabled=false,alwaysRun = true)	//high precedence = enabled 	
	public void signUp() {
		System.out.println("SignUp");
	}
	 @Test(description = "This is used to Login")
	public void login() {
		System.out.println("login");
		throw new NoSuchElementException("element not there");
		
	}
	@Test(dependsOnMethods = "TestNGBasics.LearnAttributesFour.login", alwaysRun = true)//always run even if depends method failed
	public void searchProduct()
	{
		System.out.println("Search Product");
	}
}
