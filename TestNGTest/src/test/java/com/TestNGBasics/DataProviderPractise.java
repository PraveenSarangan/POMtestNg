package com.TestNGBasics;

import org.testng.annotations.Test;

import com.Utils.DataUtilsTest;

public class DataProviderPractise {
	
	
	
	@Test(dataProvider = "login",dataProviderClass = DataUtilsTest.class)
	public void login(String data[] ) {//email , pass
		System.out.println("email " +data[0]);
		System.out.println("pass " +data[1]);
		
		/*
		 * ChromeDriver driver = new ChromeDriver(); driver.get("https://letcode.in/");
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElementByLinkText("Log in").click();
		 * driver.findElementByName("email").sendKeys(data[0]); //email
		 * driver.findElementByName("password").sendKeys(data[1]);//pass
		 * driver.findElementByXPath("//button[text()='LOGIN']").click(); driver.quit();
		 */
	}

}
