package com.TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningParameters {
	RemoteWebDriver wd;
	@Parameters({"emailId","password","browser"})
	@Test
	public void paraDemo(String email,String pass, String browser) 
	{
		switch (browser) {
		case "chrome":
			wd= new ChromeDriver();
			
			break;
		case "firefox":
			wd = new FirefoxDriver();
			break;

		default:
			System.err.println("Browser is not defined");
			break;
		}
		System.out.println(email+" "+pass);
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\NewDriver\\chromedriver.exe"); ChromeDriver wd = new ChromeDriver();
		 */
	//wd.get("https:google.com");
	wd.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
	WebElement we= wd.findElement(By.xpath("//input[@id=\"Email\"]"));
	we.click();
	we.clear();
	
	we.sendKeys(email);
	
	WebElement web= wd.findElement(By.xpath("//input[@id=\"Password\"]"));
	web.click();
	web.clear();
	web.sendKeys(pass);
	
	WebElement webb = wd.findElement(By.tagName("button"));
	webb.click();
	wd.quit();
}
}
