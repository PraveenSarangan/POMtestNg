package com.TestNGBasics;

import org.testng.annotations.Test;

public class LearnAttributesOne {
	@Test(priority =  1)
	public void signUp() {
		System.out.println("Sign Up");
	}
	@Test(priority = 2)
		public void login() {
			System.out.println("Login");
		}
	@Test(priority = 3)
	public void searchProduct() {
		System.out.println("Search Product");
	}
	@Test(priority = 4)
	public void addToCart() {
		System.out.println("Add to Cart");
	}
	@Test(priority = 5)
	public void logOut()
	{
		System.out.println("Log Out");
	}
}
