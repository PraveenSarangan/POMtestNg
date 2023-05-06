package com.TestNGBasics;

import org.testng.annotations.Test;

public class LearnAttributesTwo {
	
	@Test
	public void signUp()
	{
		System.out.println("SignUp");
	}
	@Test(dependsOnMethods = "TestNGBasics.LearnAttributesTwo.signUp", priority = -1)//from diffrent packages // dependsonmethod suppress priority//DonM Higher pricedence
	public void login()
	{
		System.out.println("Login");
	}
	@Test(dependsOnMethods = "login")
	public void searchProduct()
	{
		System.out.println("Search Product");
	}
	@Test(dependsOnMethods = "searchProduct")
	public void addToCart()
	{
		System.out.println("Add To Cart");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = "addToCart")
	public void signOut()
	{
		System.out.println("SignOut");
	}

}
