package com.TestNGBasics;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GuruBankProject {

	RemoteWebDriver driver;

	String baseURL = " http://www.demo.guru99.com/V4/";
	@Test
	public void login()
	{
		driver = new FirefoxDriver();
		driver.get(baseURL);
		
		
		String expectedTitle ="Guru99 Bank Home Page";
		String actualTitle ="";
		 actualTitle = driver.getTitle();
		 
		 if (actualTitle.contentEquals(expectedTitle)) {
			 
			 System.out.println("Test Passed");
			
		} else {
			System.out.println("Test Failed");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByName("uid").sendKeys("mngr483040");
		driver.findElementByName("password").sendKeys("zevupEs");
		driver.findElementByName("btnLogin").click();
		driver.quit();

	}

}
