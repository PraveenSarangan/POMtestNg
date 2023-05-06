package com.TestNGBasics;

import org.testng.annotations.Test;

public class LearningGroups {
	@Test(groups = {"smoke"}, priority = -1)

	public void signUp()
	{
		System.out.println("Sign Up");
	}
	@Test(groups = {"reg"})
	public void login()
	{
		System.out.println("login");
	}
	@Test(groups = {"smoke"})
	public void searchProduct() {
		System.out.println("search Product");
	}
	@Test(groups = {"sanity"})
	public void addToCart() {
		System.out.println("AddtoCart");
	}
	@Test(groups = {"reg"})
	public void logout()
	{
		System.out.println("Log Out");
	}
	
}
