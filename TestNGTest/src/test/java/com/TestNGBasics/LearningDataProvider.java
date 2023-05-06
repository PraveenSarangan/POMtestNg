package com.TestNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider { //extends DataUtils 
	
	
	/*
	 * @DataProvider(name = "login") public String[][] getData() { String [][] data
	 * = new String[2][2];
	 * 
	 * data[0][0]= "Praveenjames.r@gmail.com"; data[0][1] = "Rfid@123";
	 * 
	 * data[1][0] ="koushik1@letcode.in"; data[1][1] ="Pass123$"; return data; }
	 */
	 
	//dataprovider (name or methodname)
	@Test(dataProvider = "login", dataProviderClass = DataUtils.class)
	//public  void login(String email, String pass ) {
	public  void login(String data[] ) {  //String email, String pass
		
		
			
			System.err.println("Email "+data[0]);
			System.err.println("pass "+data[1]);
			
			  ChromeDriver driver = DataUtils.launchBrouser(); //
			 // driver.get("https://letcode.in/"); //
			  //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); // //
			  driver.findElementByLinkText("Log in").click(); //
			  driver.findElementByName("email").sendKeys(data[0]); //email//
			  driver.findElementByName("password").sendKeys(data[1]);//pass// //
			  driver.findElementByXPath("//button[text()='LOGIN']").click(); //
			  driver.quit(); //
			 			
	}

}
